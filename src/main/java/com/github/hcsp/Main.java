package com.github.hcsp;

public class Main {
    static DataService service = new DataServiceImpl();
    public static void main(String[] args) {
        System.out.println(service.a(1));
        System.out.println(service.b(1));
    }
}
