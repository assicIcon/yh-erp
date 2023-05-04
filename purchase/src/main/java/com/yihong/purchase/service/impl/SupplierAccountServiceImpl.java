package com.yihong.purchase.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.purchase.entity.SupplierAccount;
import com.yihong.purchase.service.SupplierAccountService;
import org.springframework.stereotype.Service;

/**
 * SupplierAccountServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class SupplierAccountServiceImpl extends ServiceImpl<SupplierAccount> implements SupplierAccountService {

	public SupplierAccountServiceImpl(Mapper<SupplierAccount> mapper) {
		super(mapper);
	}

}
