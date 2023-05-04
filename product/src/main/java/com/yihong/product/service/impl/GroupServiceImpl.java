package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.Group;
import com.yihong.product.service.GroupService;
import org.springframework.stereotype.Service;

/**
 * GroupServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class GroupServiceImpl extends ServiceImpl<Group> implements GroupService {

	public GroupServiceImpl(Mapper<Group> mapper) {
		super(mapper);
	}

}
