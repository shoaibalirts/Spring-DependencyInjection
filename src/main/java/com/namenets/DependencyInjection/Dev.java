package com.namenets.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Dev {
//    @Autowired // field injection
    private Laptop laptop;

    // constructor injection
    @Autowired
    public Dev(Laptop laptop){
        System.out.println("It is a constructor injection. We have omitted Autowired annotation because it was a field injection ");
        this.laptop = laptop;
    }
    @Autowired
    public void setLaptop(Laptop laptop){
        System.out.println("Constructor injection and Setter injection are better than field injection");
        this.laptop = laptop;
    }
    public void build(){
        laptop.compile();
        System.out.println("It is a standalone class or object inside IoC Container managed by Spring.");
        System.out.println("It is a standalone object because we have defined the annotation as @Component");
        System.out.println("Now it is injectable everywhere. It is just like a service");
        System.out.println("This object can only be injectable via ApplicationContext that has a method getBean");
    }
}
