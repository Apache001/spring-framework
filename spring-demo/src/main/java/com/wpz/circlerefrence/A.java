package com.wpz.circlerefrence;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author wangpengzhe
 * @date 2021/7/3 5:13 下午
 * @desc
 */
public class A {
	private B b;

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
}
