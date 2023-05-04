package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSkuCustoms;
import com.yihong.product.service.ProductSkuCustomsService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuCustomsServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSkuCustomsServiceImpl extends ServiceImpl<ProductSkuCustoms> implements ProductSkuCustomsService {

	public ProductSkuCustomsServiceImpl(Mapper<ProductSkuCustoms> mapper) {
		super(mapper);
	}

}
