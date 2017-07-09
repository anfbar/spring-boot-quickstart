package boot.repository;

import org.springframework.data.repository.CrudRepository;

import boot.model.Course;

public interface CourseRepo extends CrudRepository<Course, Integer>{
	
	public Iterable<Course> findByTopicId(int id);
	
}
