package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.WarehouseInventory;
import com.yihong.warehouse.service.WarehouseInventoryService;
import org.springframework.stereotype.Service;

/**
 * WarehouseInventoryServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class WarehouseInventoryServiceImpl extends ServiceImpl<WarehouseInventory> implements WarehouseInventoryService {

	public WarehouseInventoryServiceImpl(Mapper<WarehouseInventory> mapper) {
		super(mapper);
	}

}
