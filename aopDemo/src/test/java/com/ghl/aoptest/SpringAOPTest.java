package com.ghl.aoptest;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ghl.aoptest.service.PersonService;
import com.ghl.aoptest.service.impl.BraveKnight;

public class SpringAOPTest {
	
	@Test
    public void interceptorAnnotationTest() {
        ApplicationContext cxt = new ClassPathXmlApplicationContext("application.xml");
        PersonService personService = (PersonService) cxt.getBean("personService");
        personService.save("xxx");
        System.out.println("前置通知是类的save方法拦截");
        System.out.println("后置通知是类的所有方法都拦截");
        personService.update("1", 1);
    }
	@Test
	public void interceptorXMLTest() {
		ApplicationContext cxt = new ClassPathXmlApplicationContext("application.xml");
		BraveKnight braveKnight = (BraveKnight) cxt.getBean("knight");
		braveKnight.saying();
	}
}
