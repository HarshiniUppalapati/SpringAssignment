package com.capgemini.spring.lab1_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      
    	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
    	Employee emp=(Employee) context.getBean("employee");
    	System.out.println(emp);
    }
}
