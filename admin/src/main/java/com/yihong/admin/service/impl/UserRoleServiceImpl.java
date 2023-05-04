package com.yihong.admin.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.admin.entity.UserRole;
import com.yihong.admin.service.UserRoleService;
import org.springframework.stereotype.Service;

/**
 * UserRoleServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRole> implements UserRoleService {

	public UserRoleServiceImpl(Mapper<UserRole> mapper) {
		super(mapper);
	}

}
