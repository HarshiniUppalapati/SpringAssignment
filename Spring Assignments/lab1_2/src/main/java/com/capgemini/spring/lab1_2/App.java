package com.capgemini.spring.lab1_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
      ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
      Employee e=(Employee) context.getBean("employee");
      System.out.println(e);
    }
}
