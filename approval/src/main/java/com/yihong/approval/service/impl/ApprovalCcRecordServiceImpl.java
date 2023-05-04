package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.ApprovalCcRecord;
import com.yihong.approval.service.ApprovalCcRecordService;
import org.springframework.stereotype.Service;

/**
 * ApprovalCcRecordServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalCcRecordServiceImpl extends ServiceImpl<ApprovalCcRecord> implements ApprovalCcRecordService {
	public ApprovalCcRecordServiceImpl(Mapper<ApprovalCcRecord> mapper) {
		super(mapper);
	}
}
