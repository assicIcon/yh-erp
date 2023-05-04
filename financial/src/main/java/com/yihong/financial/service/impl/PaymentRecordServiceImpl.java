package com.yihong.financial.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.financial.entity.PaymentRecord;
import com.yihong.financial.service.PaymentRecordService;
import org.springframework.stereotype.Service;

/**
 * PaymentRecordServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class PaymentRecordServiceImpl extends ServiceImpl<PaymentRecord> implements PaymentRecordService {
	public PaymentRecordServiceImpl(Mapper<PaymentRecord> mapper) {
		super(mapper);
	}
}
