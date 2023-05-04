package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.Category;
import com.yihong.product.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * CategoryServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<Category> implements CategoryService {

	public CategoryServiceImpl(Mapper<Category> mapper) {
		super(mapper);
	}

}
