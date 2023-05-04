package com.yihong.admin.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.admin.entity.MenuFunction;
import com.yihong.admin.service.MenuFunctionService;
import org.springframework.stereotype.Service;

/**
 * MenuFunctionServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class MenuFunctionServiceImpl extends ServiceImpl<MenuFunction> implements MenuFunctionService {

	public MenuFunctionServiceImpl(Mapper<MenuFunction> mapper) {
		super(mapper);
	}

}
