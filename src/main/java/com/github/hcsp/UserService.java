package com.github.hcsp;

import java.util.UUID;

public class UserService {
    public String printGUID(int a){
        return UUID.randomUUID().toString();
    }
}
