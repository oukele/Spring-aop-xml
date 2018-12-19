package com.oukele.learning.aop0;

public class Mom {


    public void buy(){//前置通知
        System.out.println("买水果");
    }

    public void clear(){//后置通知
        System.out.println("收拾果核");
    }

}
