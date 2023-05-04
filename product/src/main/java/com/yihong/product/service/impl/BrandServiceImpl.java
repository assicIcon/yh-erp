package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.Brand;
import com.yihong.product.service.BrandService;
import org.springframework.stereotype.Service;

/**
 * BrandServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class BrandServiceImpl extends ServiceImpl<Brand> implements BrandService {

	public BrandServiceImpl(Mapper<Brand> mapper) {
		super(mapper);
	}

}
