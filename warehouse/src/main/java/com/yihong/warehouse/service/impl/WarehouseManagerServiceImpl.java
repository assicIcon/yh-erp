package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.WarehouseManager;
import com.yihong.warehouse.service.WarehouseManagerService;
import org.springframework.stereotype.Service;

/**
 * WarehouseManagerServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class WarehouseManagerServiceImpl extends ServiceImpl<WarehouseManager> implements WarehouseManagerService {

	public WarehouseManagerServiceImpl(Mapper<WarehouseManager> mapper) {
		super(mapper);
	}

}
