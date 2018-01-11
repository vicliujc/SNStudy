package com.vic.aopLearn;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class MyMethod implements MethodBeforeAdvice{

	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("日志。。。"+method.getName());
	}

}
