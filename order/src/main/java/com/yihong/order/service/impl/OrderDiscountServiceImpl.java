package com.yihong.order.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.order.entity.OrderDiscount;
import com.yihong.order.service.OrderDiscountService;
import org.springframework.stereotype.Service;

/**
 * OrderDiscountServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OrderDiscountServiceImpl extends ServiceImpl<OrderDiscount> implements OrderDiscountService {

	public OrderDiscountServiceImpl(Mapper<OrderDiscount> mapper) {
		super(mapper);
	}

}
