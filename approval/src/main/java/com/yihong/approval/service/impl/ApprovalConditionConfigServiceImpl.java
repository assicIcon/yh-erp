package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.ApprovalConditionConfig;
import com.yihong.approval.service.ApprovalConditionConfigService;
import org.springframework.stereotype.Service;

/**
 * ApprovalConditionConfigServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalConditionConfigServiceImpl extends ServiceImpl<ApprovalConditionConfig> implements ApprovalConditionConfigService {

	public ApprovalConditionConfigServiceImpl(Mapper<ApprovalConditionConfig> mapper) {
		super(mapper);
	}

}
