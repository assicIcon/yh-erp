package com.yihong.approval.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.approval.entity.Approval;
import com.yihong.approval.service.ApprovalService;
import org.springframework.stereotype.Service;

/**
 * ApprovalServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ApprovalServiceImpl extends ServiceImpl<Approval> implements ApprovalService {

	public ApprovalServiceImpl(Mapper<Approval> mapper) {
		super(mapper);
	}

}
