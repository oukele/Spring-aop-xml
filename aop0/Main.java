package com.oukele.learning.aop0;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("aop2.xml");
        Child child = (Child) context.getBean("child");
        child.eat();

    }
}
