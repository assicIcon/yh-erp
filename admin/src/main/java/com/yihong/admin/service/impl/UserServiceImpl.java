package com.yihong.admin.service.impl;

import com.common.mapper.Mapper;
import com.common.service.impl.ServiceImpl;
import com.yihong.admin.entity.User;
import com.yihong.admin.service.UserService;
import org.springframework.stereotype.Service;

/**
 * UserServiceImpl
 *
 * @author Runhu-Wu
 * @date 2023/4/14
 */
@Service
public class UserServiceImpl extends ServiceImpl<User> implements UserService {

	public UserServiceImpl(Mapper<User> mapper) {
		super(mapper);
	}

}
