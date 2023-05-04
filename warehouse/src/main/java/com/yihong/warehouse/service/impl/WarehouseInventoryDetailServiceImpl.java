package com.yihong.warehouse.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.warehouse.entity.WarehouseInventoryDetail;
import com.yihong.warehouse.service.WarehouseInventoryDetailService;
import org.springframework.stereotype.Service;

/**
 * WarehouseInventoryDetailServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class WarehouseInventoryDetailServiceImpl extends ServiceImpl<WarehouseInventoryDetail> implements WarehouseInventoryDetailService {

	public WarehouseInventoryDetailServiceImpl(Mapper<WarehouseInventoryDetail> mapper) {
		super(mapper);
	}

}
