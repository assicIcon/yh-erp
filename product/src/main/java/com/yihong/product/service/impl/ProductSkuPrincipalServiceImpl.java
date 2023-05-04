package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSkuPrincipal;
import com.yihong.product.service.ProductSkuPrincipalService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuPrincipalServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSkuPrincipalServiceImpl extends ServiceImpl<ProductSkuPrincipal> implements ProductSkuPrincipalService {

	public ProductSkuPrincipalServiceImpl(Mapper<ProductSkuPrincipal> mapper) {
		super(mapper);
	}

}
