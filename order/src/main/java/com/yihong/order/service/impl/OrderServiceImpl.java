package com.yihong.order.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.order.entity.Order;
import com.yihong.order.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * OrderServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OrderServiceImpl extends ServiceImpl<Order> implements OrderService {

	public OrderServiceImpl(Mapper<Order> mapper) {
		super(mapper);
	}

}
