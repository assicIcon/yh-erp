package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.ApprovalCcConfig;
import com.yihong.approval.service.ApprovalCcConfigService;
import org.springframework.stereotype.Service;

/**
 * ApprovalCcConfigServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalCcConfigServiceImpl extends ServiceImpl<ApprovalCcConfig> implements ApprovalCcConfigService {
	public ApprovalCcConfigServiceImpl(Mapper<ApprovalCcConfig> mapper) {
		super(mapper);
	}
}
