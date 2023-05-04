package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.ApprovalNodeConfig;
import com.yihong.approval.service.ApprovalNodeConfigService;
import org.springframework.stereotype.Service;

/**
 * ApprovalNodeConfigServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalNodeConfigServiceImpl extends ServiceImpl<ApprovalNodeConfig> implements ApprovalNodeConfigService {

	public ApprovalNodeConfigServiceImpl(Mapper<ApprovalNodeConfig> mapper) {
		super(mapper);
	}

}
