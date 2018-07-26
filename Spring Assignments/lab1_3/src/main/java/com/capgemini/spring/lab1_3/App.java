package com.capgemini.spring.lab1_3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        SBU sbu=(SBU)context.getBean("bu");
        System.out.println(sbu);
    }
}
