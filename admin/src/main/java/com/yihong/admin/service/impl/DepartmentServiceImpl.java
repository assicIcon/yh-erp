package com.yihong.admin.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.admin.entity.Department;
import com.yihong.admin.service.DepartmentService;
import org.springframework.stereotype.Service;

/**
 * DepartmentServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class DepartmentServiceImpl extends ServiceImpl<Department> implements DepartmentService {

	public DepartmentServiceImpl(Mapper<Department> mapper) {
		super(mapper);
	}

}
