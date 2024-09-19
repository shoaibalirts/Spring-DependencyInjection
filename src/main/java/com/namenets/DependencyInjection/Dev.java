package com.namenets.DependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Dev {
    public void build(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("It is a standalone class or object inside IoC Container managed by Spring.");
        System.out.println("It is a standalone object because we have defined the annotation as @Component");
        System.out.println("Now it is injectable everywhere. It is just like a service");
        System.out.println("This object can only be injectable via ApplicationContext that has a method getBean");
    }
}
