package com.ghl.aoptest;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyInterceptor {
	/**
	 * 先定义切面，增加到类或者方法上
	 */
	 //@Pointcut("execution (* com.ghl.aoptest.service.impl.PersonServiceImpl.*(..))")
	@Pointcut("execution (* com.ghl.aoptest.service.impl.PersonServiceImpl.save(..))")
	 private void anyMethod() {} // 声明一个切入点，anyMethod为切入点名称，随意的

	    // 声明该方法是一个前置通知：在目标方法开始之前执行 
    @Before("anyMethod()")
    public void doAccessCheck() {
        System.out.println("前置通知");
    }
    
    /**
     * 直接在通知中定义切面
     */
    @After("execution (* com.ghl.aoptest.service.impl.PersonServiceImpl.*(..))")
    public void doAccessCheckAfter() {
    	System.out.println("后置通知");
    }
}
