package com.yihong.financial.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.financial.entity.Company;
import com.yihong.financial.service.CompanyService;
import org.springframework.stereotype.Service;

/**
 * CompanyServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class CompanyServiceImpl extends ServiceImpl<Company> implements CompanyService {
	public CompanyServiceImpl(Mapper<Company> mapper) {
		super(mapper);
	}
}
