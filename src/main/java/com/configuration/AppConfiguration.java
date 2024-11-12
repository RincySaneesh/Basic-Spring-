package com.configuration;

import com.repository.CourseRepository;
import com.service.CourseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example")
public class AppConfiguration {
/*
   @Bean("CourseRepository")
    public CourseRepository getcourseRepository(){
       return new CourseRepository();
   }

    @Bean("CourseService")
    public CourseService getCourseService(){
        return new CourseService(getcourseRepository());
    }*/
}
