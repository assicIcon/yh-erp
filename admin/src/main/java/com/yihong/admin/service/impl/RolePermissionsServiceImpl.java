package com.yihong.admin.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.admin.entity.RolePermissions;
import com.yihong.admin.service.RolePermissionsService;
import org.springframework.stereotype.Service;

/**
 * RolePermissionsServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class RolePermissionsServiceImpl extends ServiceImpl<RolePermissions> implements RolePermissionsService {

	public RolePermissionsServiceImpl(Mapper<RolePermissions> mapper) {
		super(mapper);
	}

}
