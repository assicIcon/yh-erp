package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.ApprovalNodeRecord;
import com.yihong.approval.service.ApprovalNodeRecordService;
import org.springframework.stereotype.Service;

/**
 * ApprovalNodeRecordServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalNodeRecordServiceImpl extends ServiceImpl<ApprovalNodeRecord> implements ApprovalNodeRecordService {

	public ApprovalNodeRecordServiceImpl(Mapper<ApprovalNodeRecord> mapper) {
		super(mapper);
	}

}
