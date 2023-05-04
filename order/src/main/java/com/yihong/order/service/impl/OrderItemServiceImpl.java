package com.yihong.order.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.order.entity.OrderItem;
import com.yihong.order.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 * OrderItemServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItem> implements OrderItemService {

	public OrderItemServiceImpl(Mapper<OrderItem> mapper) {
		super(mapper);
	}

}
