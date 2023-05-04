package com.yihong.financial.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.financial.entity.PaymentApplyItem;
import com.yihong.financial.service.PaymentApplyItemService;
import org.springframework.stereotype.Service;

/**
 * PaymentApplyItemServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class PaymentApplyItemServiceImpl extends ServiceImpl<PaymentApplyItem> implements PaymentApplyItemService {

	public PaymentApplyItemServiceImpl(Mapper<PaymentApplyItem> mapper) {
		super(mapper);
	}

}
