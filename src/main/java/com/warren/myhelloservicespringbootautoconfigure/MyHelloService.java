package com.warren.myhelloservicespringbootautoconfigure;

public class MyHelloService {
    private final String prefix;
    private final String suffix;

    public MyHelloService(String prefix, String suffix) {
        this.prefix = prefix;
        this.suffix = suffix;
    }

    public String sayHello(String name) {
        return prefix + name + suffix;
    }
}
