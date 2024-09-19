package com.namenets.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build(){
        System.out.println("We created a object inside IoC Container");
    }
}
