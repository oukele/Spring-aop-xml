package com.oukele.learning.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Cat bean = context.getBean(Cat.class);
        bean.fly();

    }

}
