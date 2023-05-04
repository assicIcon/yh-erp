package com.yihong.financial.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.financial.entity.PaymentApply;
import com.yihong.financial.service.PaymentApplyService;
import org.springframework.stereotype.Service;

/**
 * PaymentApplyServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class PaymentApplyServiceImpl extends ServiceImpl<PaymentApply> implements PaymentApplyService {

	public PaymentApplyServiceImpl(Mapper<PaymentApply> mapper) {
		super(mapper);
	}

}
