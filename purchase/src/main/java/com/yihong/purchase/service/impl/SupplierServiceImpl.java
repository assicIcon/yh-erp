package com.yihong.purchase.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.purchase.entity.Supplier;
import com.yihong.purchase.service.SupplierService;
import org.springframework.stereotype.Service;

/**
 * SupplierServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class SupplierServiceImpl extends ServiceImpl<Supplier> implements SupplierService {

	public SupplierServiceImpl(Mapper<Supplier> mapper) {
		super(mapper);
	}

}
