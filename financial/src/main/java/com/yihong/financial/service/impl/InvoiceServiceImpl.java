package com.yihong.financial.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.financial.entity.Invoice;
import com.yihong.financial.service.InvoiceService;
import org.springframework.stereotype.Service;

/**
 * InvoiceServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class InvoiceServiceImpl extends ServiceImpl<Invoice> implements InvoiceService {

	public InvoiceServiceImpl(Mapper<Invoice> mapper) {
		super(mapper);
	}

}
