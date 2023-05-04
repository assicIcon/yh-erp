package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSkuImage;
import com.yihong.product.service.ProductSkuImageService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuImageServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSkuImageServiceImpl extends ServiceImpl<ProductSkuImage> implements ProductSkuImageService {

	public ProductSkuImageServiceImpl(Mapper<ProductSkuImage> mapper) {
		super(mapper);
	}

}
