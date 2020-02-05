package com.github.hcsp;

import java.util.HashMap;
import java.util.Map;

public class CacheDecorator implements DataService {
    private Map<String,String> cache = new HashMap<>();
    private DataService delegate;

    public CacheDecorator(DataService delegate) {
        this.delegate = delegate;
    }

    public String a(int i) {
        String cachedValue = cache.get("a");
        if(cachedValue == null){
            String val = delegate.a(i);
            cache.put("a",val);
            return val;
        }else {
            return cachedValue;
        }

    }

    public String b(int i) {
        String cachedValue = cache.get("b");
        if(cachedValue == null){
            String val = delegate.b(i);
            cache.put("b",val);
            return val;
        }else {
            return cachedValue;
        }
    }
}
