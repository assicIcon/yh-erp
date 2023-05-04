package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.Warehouse;
import com.yihong.warehouse.service.WarehouseService;
import org.springframework.stereotype.Service;

/**
 * WarehouseServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class WarehouseServiceImpl extends ServiceImpl<Warehouse> implements WarehouseService {

	public WarehouseServiceImpl(Mapper<Warehouse> mapper) {
		super(mapper);
	}

}
