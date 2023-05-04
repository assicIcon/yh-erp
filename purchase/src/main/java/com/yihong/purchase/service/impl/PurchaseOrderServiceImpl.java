package com.yihong.purchase.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.purchase.entity.PurchaseOrder;
import com.yihong.purchase.service.PurchaseOrderService;
import org.springframework.stereotype.Service;

/**
 * PurchaseOrderServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class PurchaseOrderServiceImpl extends ServiceImpl<PurchaseOrder> implements PurchaseOrderService {

	public PurchaseOrderServiceImpl(Mapper<PurchaseOrder> mapper) {
		super(mapper);
	}

}
