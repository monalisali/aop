package com.github.hcsp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

public class LogProxy implements InvocationHandler {
    DataService delegate;

    public LogProxy(DataService delegate){
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*********JDK 动态代理**************");
        System.out.println(method.getName() + " is invoked: " + Arrays.toString(args));
        //调用真正的方法
        Object retValue = method.invoke(delegate,args);
        System.out.println(method.getName() + " is finished: " + retValue);
        System.out.println("*********JDK 动态代理**************");
        return retValue;
    }
}
