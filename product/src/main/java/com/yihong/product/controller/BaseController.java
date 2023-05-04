package com.yihong.product.controller;

import com.common.core.exception.client.ParameterException;
import com.common.core.response.Response;
import com.common.core.response.ResponseBuilder;
import com.common.core.util.ReflectUtil;
import com.common.core.util.StringUtil;
import com.common.service.Service;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.*;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;


/**
 * BaseController
 *
 * @author Runhu-Wu
 * @date 2022/12/20
 */
@RestController
@RequestMapping("/{function}")
public class BaseController implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}

	/**
	 * 全部信息列表
	 *
	 * @param function 功能名称
	 * @param <T>      实体对象类型
	 * @return 全部信息列表
	 */
	@GetMapping
	public <T> Response<List<T>> listAll(@PathVariable String function) {
		Service<T> service = getService(function);
		return ResponseBuilder.success(service.listAll());
	}

	/**
	 * 保存信息
	 *
	 * @param function 功能名称
	 * @param body     请求Body
	 * @param <T>      实体对象类型
	 * @return 状态码和描述信息
	 */
	@PostMapping
	public <T> Response<Void> save(@PathVariable String function, @RequestBody Map<String, Object> body) {
		Service<T> service = getService(function);
		T entity = ReflectUtil.mapToObj(body, getEntityClass(service));
		service.saveSelective(entity);
		return ResponseBuilder.success();
	}

	/**
	 * 修改信息
	 *
	 * @param function 功能名称
	 * @param id       主键ID
	 * @param body     请求Body
	 * @param <T>      实体对象类型
	 * @return 状态码和描述信息
	 */
	@PutMapping("/{id}")
	public <T> Response<Void> update(@PathVariable String function, @PathVariable Long id, @RequestBody Map<String, Object> body) {
		Service<T> service = getService(function);
		body.put("id", id);
		T entity = ReflectUtil.mapToObj(body, getEntityClass(service));
		service.updateByPrimaryKeySelective(entity);
		return ResponseBuilder.success();
	}

	/**
	 * 删除信息
	 *
	 * @param function 功能名称
	 * @param id       主键ID
	 * @return 状态码和描述信息
	 */
	@DeleteMapping("/{id}")
	public Response<Void> delete(@PathVariable String function, @PathVariable Long id) {
		Service<?> service = getService(function);
		service.removeByPrimaryKey(id);
		return ResponseBuilder.success();
	}

	/**
	 * 根据功能名称获取对应的Service
	 *
	 * @param function 功能名称
	 * @param <T>      实体对象类型
	 * @return Service
	 */
	@SuppressWarnings("unchecked")
	private <T> Service<T> getService(String function) {
		String serviceName = StringUtil.underscoreToHump(function.replace("-", "_")) + "ServiceImpl";
		try {
			return applicationContext.getBean(serviceName, Service.class);
		} catch (NoSuchBeanDefinitionException e) {
			throw new ParameterException("path not support");
		}
	}

	/**
	 * 根据Service获取对应的实体对象类型
	 *
	 * @param service Service
	 * @param <T>     实体对象类型
	 * @return 实体对象类型
	 */
	@SuppressWarnings("unchecked")
	private <T> Class<T> getEntityClass(Service<T> service) {
		return (Class<T>) ((ParameterizedType) service.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

}
