package com.yihong.purchase.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.purchase.entity.SupplierQuotation;
import com.yihong.purchase.service.SupplierQuotationService;
import org.springframework.stereotype.Service;

/**
 * SupplierQuotationServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class SupplierQuotationServiceImpl extends ServiceImpl<SupplierQuotation> implements SupplierQuotationService {

	public SupplierQuotationServiceImpl(Mapper<SupplierQuotation> mapper) {
		super(mapper);
	}

}
