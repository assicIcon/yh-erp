package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.ProductSkuPackage;
import com.yihong.product.service.ProductSkuPackageService;
import org.springframework.stereotype.Service;

/**
 * ProductSkuPackageServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class ProductSkuPackageServiceImpl extends ServiceImpl<ProductSkuPackage> implements ProductSkuPackageService {

	public ProductSkuPackageServiceImpl(Mapper<ProductSkuPackage> mapper) {
		super(mapper);
	}

}
