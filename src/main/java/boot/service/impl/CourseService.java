package boot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import boot.model.Course;
import boot.repository.CourseRepo;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepo repo;

	public List<Course> getCourses(int id) {
		List<Course> courses = new ArrayList<>();
		repo.findByTopicId(id).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(int id) {
		return repo.findOne(id);
	}

	public Course addCourse(Course course) {
		return repo.save(course);
	}

	public Course updateCourse(Course course) {
		return repo.save(course);
	}

	public void deleteCourse(int id) {
		repo.delete(id);
	}
	
}
