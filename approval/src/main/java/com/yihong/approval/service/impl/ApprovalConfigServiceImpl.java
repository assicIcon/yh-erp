package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.ApprovalConfig;
import com.yihong.approval.service.ApprovalConfigService;
import org.springframework.stereotype.Service;

/**
 * ApprovalConfigServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalConfigServiceImpl extends ServiceImpl<ApprovalConfig> implements ApprovalConfigService {
	public ApprovalConfigServiceImpl(Mapper<ApprovalConfig> mapper) {
		super(mapper);
	}
}
