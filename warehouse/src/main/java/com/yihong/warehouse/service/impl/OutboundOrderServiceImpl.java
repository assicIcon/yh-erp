package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.OutboundOrder;
import com.yihong.warehouse.service.OutboundOrderService;
import org.springframework.stereotype.Service;

/**
 * OutboundOrderServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OutboundOrderServiceImpl extends ServiceImpl<OutboundOrder> implements OutboundOrderService {

	public OutboundOrderServiceImpl(Mapper<OutboundOrder> mapper) {
		super(mapper);
	}

}
