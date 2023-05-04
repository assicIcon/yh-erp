package com.yihong.financial.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.financial.entity.PaymentOrder;
import com.yihong.financial.service.PaymentOrderService;
import org.springframework.stereotype.Service;

/**
 * PaymentOrderServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class PaymentOrderServiceImpl extends ServiceImpl<PaymentOrder> implements PaymentOrderService {
	public PaymentOrderServiceImpl(Mapper<PaymentOrder> mapper) {
		super(mapper);
	}
}
