package com.wpz.test;

import org.springframework.beans.factory.InitializingBean;

/**
 * @author bytedance
 */
public class MyPropertySet implements InitializingBean {
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet 执行");
	}
}
