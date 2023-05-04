package com.yihong.admin.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.admin.entity.Role;
import com.yihong.admin.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * RoleServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class RoleServiceImpl extends ServiceImpl<Role> implements RoleService {

	public RoleServiceImpl(Mapper<Role> mapper) {
		super(mapper);
	}

}
