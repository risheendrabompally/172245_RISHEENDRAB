package com.Employee.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Loggingaspect {

	@Before("execution(public * get*())")
	public void getEmp1() {
		System.out.println("kj bvb");
	}

	/*
	 * @After("execution(public String getMaxSal(*))") public void getEmp2() {
	 * System.out.println("v kjsnkvb"); } 
	 */
}
