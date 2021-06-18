package com.wpz.aop.service.impl;

import com.wpz.aop.service.UserManagerService;

/**
 * @author wangpengzhe
 * @date 2021/5/9 9:14 下午
 * @desc
 */
public class UserManagerServiceImpl implements UserManagerService {
	@Override
	public String findUserById(int userId) {
		System.out.println("---------UserManagerImpl.findUserById()--------");
		if (userId <= 0) {
			throw new IllegalArgumentException("该用户不存在!");
		}
		return "张三";
	}
}
