package com.service;
import com.model.Course;
import com.repository.CourseRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class CourseService implements CrudService<Course> {

    private CourseRepository repository;

    public CourseService(CourseRepository courseRepository){
    repository=courseRepository;
    }

    @Override
    public List<Course> List() {
        return repository.findAll();
    }

    @Override
    public Course create(Course course) {
      return null;
    }

    @Override
    public Optional<Course> get(int id) {
        return Optional.empty();
    }

    @Override
    public void update(Course course, int id) {

    }

    @Override
    public void delete(int id) {

    }
}
