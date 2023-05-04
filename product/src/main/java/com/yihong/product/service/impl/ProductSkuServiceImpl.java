package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSku;
import com.yihong.product.service.ProductSkuService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSkuServiceImpl extends ServiceImpl<ProductSku> implements ProductSkuService {

	public ProductSkuServiceImpl(Mapper<ProductSku> mapper) {
		super(mapper);
	}

}
