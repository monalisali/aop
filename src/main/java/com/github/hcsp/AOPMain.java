package com.github.hcsp;

import java.lang.reflect.Proxy;

public class AOPMain {
    static DataService service = new DataServiceImpl();
    public static void main(String[] args) {
        //Proxy.newProxyInstance
        //第一个参数：被代理的类
        //第二个参数：被代理的接口(也只能是接口)
        //第三个参数：打断方法的代理，对被代理类进行处理的地方
       DataService dataService = (DataService) Proxy.newProxyInstance(service.getClass().getClassLoader()
       ,new Class[]{DataService.class}
       ,new LogProxy(service));

       dataService.a(1);
       dataService.b(1);
    }
}
