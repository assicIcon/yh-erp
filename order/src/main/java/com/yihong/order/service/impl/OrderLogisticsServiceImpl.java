package com.yihong.order.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.order.entity.OrderLogistics;
import com.yihong.order.service.OrderLogisticsService;
import org.springframework.stereotype.Service;

/**
 * OrderLogisticsServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OrderLogisticsServiceImpl extends ServiceImpl<OrderLogistics> implements OrderLogisticsService {

	public OrderLogisticsServiceImpl(Mapper<OrderLogistics> mapper) {
		super(mapper);
	}

}
