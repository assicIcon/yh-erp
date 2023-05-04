package com.yihong.purchase.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.purchase.entity.PurchaseOrderItem;
import com.yihong.purchase.service.PurchaseOrderItemService;
import org.springframework.stereotype.Service;

/**
 * PurchaseOrderItemServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class PurchaseOrderItemServiceImpl extends ServiceImpl<PurchaseOrderItem> implements PurchaseOrderItemService {

	public PurchaseOrderItemServiceImpl(Mapper<PurchaseOrderItem> mapper) {
		super(mapper);
	}

}
