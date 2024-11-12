package com.example;

import com.configuration.AppConfiguration;
import com.service.CourseService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String args[])
    {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(AppConfiguration.class);
        CourseService service=applicationContext.getBean("courseservice", CourseService.class);
        System.out.println(service.List());
    }
}

