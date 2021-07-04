package com.wpz.circlerefrence;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangpengzhe
 * @date 2021/7/3 5:13 下午
 * @desc
 */
public class B {
	private A a;

	public A getA() {
		return a;
	}

	public void setA(A a) {
		this.a = a;
	}
}
