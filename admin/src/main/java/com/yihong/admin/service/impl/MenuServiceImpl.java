package com.yihong.admin.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.admin.entity.Menu;
import com.yihong.admin.service.MenuService;
import org.springframework.stereotype.Service;

/**
 * MenuServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class MenuServiceImpl extends ServiceImpl<Menu> implements MenuService {

	public MenuServiceImpl(Mapper<Menu> mapper) {
		super(mapper);
	}

}
