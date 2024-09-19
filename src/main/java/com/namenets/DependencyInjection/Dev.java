package com.namenets.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {
    @Autowired // field injection
    @Qualifier("desktop")
    private Computer comp;

    // constructor injection
//    @Autowired
//    public Dev(Laptop laptop){
//        System.out.println("It is a constructor injection. We have omitted Autowired annotation because it was a field injection ");
//        this.laptop = laptop;
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        System.out.println("Constructor injection and Setter injection are better than field injection");
//        this.laptop = laptop;
//    }
    public void build(){
        comp.compile();
    }
}
