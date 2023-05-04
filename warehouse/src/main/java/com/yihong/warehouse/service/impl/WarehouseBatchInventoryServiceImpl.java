package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.WarehouseBatchInventory;
import com.yihong.warehouse.service.WarehouseBatchInventoryService;
import org.springframework.stereotype.Service;

/**
 * WarehouseBatchInventoryServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class WarehouseBatchInventoryServiceImpl extends ServiceImpl<WarehouseBatchInventory> implements WarehouseBatchInventoryService {

	public WarehouseBatchInventoryServiceImpl(Mapper<WarehouseBatchInventory> mapper) {
		super(mapper);
	}

}
