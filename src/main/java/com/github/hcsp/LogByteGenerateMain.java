package com.github.hcsp;

import net.sf.cglib.proxy.Enhancer;

public class LogByteGenerateMain {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserService.class);
        enhancer.setCallback(new LogByteGenerateInterceptor(userService));
        UserService enhancedService = (UserService)enhancer.create();
        enhancedService.printGUID(1);
    }
}
