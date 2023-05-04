package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSkuAttr;
import com.yihong.product.service.ProductSkuAttrService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuAttrServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSkuAttrServiceImpl extends ServiceImpl<ProductSkuAttr> implements ProductSkuAttrService {

	public ProductSkuAttrServiceImpl(Mapper<ProductSkuAttr> mapper) {
		super(mapper);
	}

}
