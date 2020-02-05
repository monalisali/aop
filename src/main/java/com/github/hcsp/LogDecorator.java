package com.github.hcsp;

public class LogDecorator implements DataService {
    private DataService delegate;

    public LogDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    public String a(int i) {
        System.out.println("a is invoked: " + i);
        String val = delegate.a(i);
        System.out.println("a is finished: " + val);
        return val;
    }

    public String b(int i) {
        System.out.println("b is invoked: " + i);
        String val = delegate.b(i);
        System.out.println("b is finished: " + val);
        return val;
    }
}
