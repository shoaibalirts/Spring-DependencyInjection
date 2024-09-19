package com.namenets.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    public void compile(){
        System.out.println("Dev is dependent on Laptop and without Laptop he/she can not develope any software");
    }
}
