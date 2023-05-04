package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.OutboundOrderItem;
import com.yihong.warehouse.service.OutboundOrderItemService;
import org.springframework.stereotype.Service;

/**
 * OutboundOrderItemServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class OutboundOrderItemServiceImpl extends ServiceImpl<OutboundOrderItem> implements OutboundOrderItemService {

	public OutboundOrderItemServiceImpl(Mapper<OutboundOrderItem> mapper) {
		super(mapper);
	}

}
