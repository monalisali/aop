package com.github.hcsp;

public class Main {
    //1. 直接调用DataServiceImpl
    //static DataService service = new DataServiceImpl();

    //2. 装饰模式，用LogDecorator把DataServiceImp包了一层
    //static DataService service = new LogDecorator(new DataServiceImpl());

    //3. 装饰模式，用CacheDecorator把LogDecorator包了一层
    static DataService service = new CacheDecorator(new LogDecorator(new DataServiceImpl()));
    public static void main(String[] args) {
        System.out.println(service.a(1));
        System.out.println(service.b(1));

        System.out.println("******直接输出缓存中的值************");
        System.out.println(service.a(1));
        System.out.println(service.b(1));
    }
}
