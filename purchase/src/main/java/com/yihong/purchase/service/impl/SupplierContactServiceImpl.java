package com.yihong.purchase.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.purchase.entity.SupplierContact;
import com.yihong.purchase.service.SupplierContactService;
import org.springframework.stereotype.Service;

/**
 * SupplierContactServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class SupplierContactServiceImpl extends ServiceImpl<SupplierContact> implements SupplierContactService {

	public SupplierContactServiceImpl(Mapper<SupplierContact> mapper) {
		super(mapper);
	}

}
