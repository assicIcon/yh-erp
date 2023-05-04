package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.ApprovalNoticeConfig;
import com.yihong.approval.service.ApprovalNoticeConfigService;
import org.springframework.stereotype.Service;

/**
 * ApprovalNoticeConfigServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalNoticeConfigServiceImpl extends ServiceImpl<ApprovalNoticeConfig> implements ApprovalNoticeConfigService {

	public ApprovalNoticeConfigServiceImpl(Mapper<ApprovalNoticeConfig> mapper) {
		super(mapper);
	}

}
