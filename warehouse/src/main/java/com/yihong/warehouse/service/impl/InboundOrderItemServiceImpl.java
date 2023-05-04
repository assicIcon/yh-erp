package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.InboundOrderItem;
import com.yihong.warehouse.service.InboundOrderItemService;
import org.springframework.stereotype.Service;

/**
 * InboundOrderItemServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class InboundOrderItemServiceImpl extends ServiceImpl<InboundOrderItem> implements InboundOrderItemService {

	public InboundOrderItemServiceImpl(Mapper<InboundOrderItem> mapper) {
		super(mapper);
	}

}
