package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSpu;
import com.yihong.product.service.ProductSpuService;
import org.springframework.stereotype.Service;

/**
 * ProductSpuServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSpuServiceImpl extends ServiceImpl<ProductSpu> implements ProductSpuService {

	public ProductSpuServiceImpl(Mapper<ProductSpu> mapper) {
		super(mapper);
	}

}
