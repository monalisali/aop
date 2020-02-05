package com.github.hcsp;

import java.util.UUID;

public class DataServiceImpl implements DataService {
    public String a(int i) {
        System.out.println("a is called! paramter is: " + i);
        String ret = UUID.randomUUID().toString();
        System.out.println("a is finished: " + ret);
        return ret;
    }

    public String b(int i) {
        System.out.println("b is called! paramter is: " + i);
        String ret = UUID.randomUUID().toString();
        System.out.println("b is finished: " + ret);
        return ret;
    }
}

