package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.GroupAttr;
import com.yihong.product.service.GroupAttrService;
import org.springframework.stereotype.Service;

/**
 * GroupAttrServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class GroupAttrServiceImpl extends ServiceImpl<GroupAttr> implements GroupAttrService {

	public GroupAttrServiceImpl(Mapper<GroupAttr> mapper) {
		super(mapper);
	}

}
