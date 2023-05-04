package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSkuResource;
import com.yihong.product.service.ProductSkuResourceService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuResourceServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSkuResourceServiceImpl extends ServiceImpl<ProductSkuResource> implements ProductSkuResourceService {

	public ProductSkuResourceServiceImpl(Mapper<ProductSkuResource> mapper) {
		super(mapper);
	}

}
