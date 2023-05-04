package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.InboundOrder;
import com.yihong.warehouse.service.InboundOrderService;
import org.springframework.stereotype.Service;

/**
 * InboundOrderServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class InboundOrderServiceImpl extends ServiceImpl<InboundOrder> implements InboundOrderService {

	public InboundOrderServiceImpl(Mapper<InboundOrder> mapper) {
		super(mapper);
	}

}
