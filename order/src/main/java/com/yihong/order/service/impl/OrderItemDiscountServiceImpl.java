package com.yihong.order.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.order.entity.OrderItemDiscount;
import com.yihong.order.service.OrderItemDiscountService;
import org.springframework.stereotype.Service;

/**
 * OrderItemDiscountServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OrderItemDiscountServiceImpl extends ServiceImpl<OrderItemDiscount> implements OrderItemDiscountService {

	public OrderItemDiscountServiceImpl(Mapper<OrderItemDiscount> mapper) {
		super(mapper);
	}

}
