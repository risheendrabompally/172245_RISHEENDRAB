package com.spring.AOP.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {
	
//	@Before("allGetters() && forAll()")
//	public void loggingAdvice(JoinPoint joinpoint) {
//		System.out.println(joinpoint.getTarget());
//	}
//	
//	@AfterReturning("args(name)")
//	public void stringArgMethods(String name) {
//		System.out.println("method with string arguments is called. name is :" +name);
//	}
//	
//	@Before("allGetters()")
//	public void secondAdvice() {
//		System.out.println("get method called --2");
//	}
//
//	@Pointcut("within(com.spring.AOP.model.Circle)")	
//	public void forAll() {
//		
//	}
	
	@Pointcut("execution(* get*())")
	public void allGetters() {
		
	}
	
	@Around("@annotation(com.spring.AOP.aspect.Loggable)")
	public Object myAroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
		
		Object returnValue=null;
		
		try {
			System.out.println("before advice");
			returnValue=proceedingJoinPoint.proceed();
			System.out.println("after returning");
		}
		catch(Throwable e) {
			System.out.println("after throwing");
		}
		System.out.println("after finally");
		return returnValue;
	}
}
