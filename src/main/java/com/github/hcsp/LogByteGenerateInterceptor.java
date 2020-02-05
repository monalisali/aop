package com.github.hcsp;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogByteGenerateInterceptor implements MethodInterceptor {
    private UserService delegate;

    public LogByteGenerateInterceptor(UserService delegate) {
        this.delegate = delegate;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("*********AOP 字节码生成**************");
        System.out.println(method.getName() + " is invoked: " + Arrays.toString(objects));
        //调用真正的方法
        Object retValue = method.invoke(delegate,objects);
        System.out.println(method.getName() + " is finished: " + retValue);
        System.out.println("*********AOP 字节码生成**************");
        return retValue;
    }
}
