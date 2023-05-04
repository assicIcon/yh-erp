package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.AttrOptionalValue;
import com.yihong.product.service.AttrOptionalValueService;
import org.springframework.stereotype.Service;

/**
 * AttrOptionalValueServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class AttrOptionalValueServiceImpl extends ServiceImpl<AttrOptionalValue> implements AttrOptionalValueService {

	public AttrOptionalValueServiceImpl(Mapper<AttrOptionalValue> mapper) {
		super(mapper);
	}

}
