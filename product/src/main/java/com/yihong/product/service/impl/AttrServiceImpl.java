package com.yihong.product.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.product.entity.Attr;
import com.yihong.product.service.AttrService;
import org.springframework.stereotype.Service;

/**
 * AttrServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class AttrServiceImpl extends ServiceImpl<Attr> implements AttrService {

	public AttrServiceImpl(Mapper<Attr> mapper) {
		super(mapper);
	}

}
