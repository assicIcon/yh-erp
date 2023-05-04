package com.yihong.order.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.order.entity.OrderPayment;
import com.yihong.order.service.OrderPaymentService;
import org.springframework.stereotype.Service;

/**
 * OrderPaymentServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OrderPaymentServiceImpl extends ServiceImpl<OrderPayment> implements OrderPaymentService {

	public OrderPaymentServiceImpl(Mapper<OrderPayment> mapper) {
		super(mapper);
	}

}
