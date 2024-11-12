package com.repository;

import com.model.Course;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CourseRepository implements CrudRepository<Course> {
    @Override
    public List<Course> findAll() {
        List<Course>courses=new ArrayList<>();
        Course springBoot =new Course(1,"C","Fundamentals of C","https://www.com.model/Course");
        courses.add(springBoot);
        return courses;
    }
}

