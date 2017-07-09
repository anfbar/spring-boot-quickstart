package boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import boot.model.Course;
import boot.model.Topic;
import boot.service.impl.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService myServ;
	
	@GetMapping("/topic/{id}/course/all")
	public List<Course> getAllCourses(@PathVariable int id) {
		return myServ.getCourses(id);
	}
	
	@GetMapping("/topic/{tid}/course/{id}")
	public Course getCourse(@PathVariable int id) {
		return myServ.getCourse(id);
	}
	
	@PostMapping("/topic/{tid}/course/add")
	public Course addCourse(@RequestBody Course course, @PathVariable int tid) {
		course.setTopic(new Topic(tid, ""));
		return myServ.addCourse(course);
	}
	
	@PostMapping("/topic/{tid}/course/update")
	public Course updCourse(@RequestBody Course course, @PathVariable int tid) {
		course.setTopic(new Topic(tid, ""));
		return myServ.updateCourse(course);
	}
	
	@GetMapping("/topic/{tid}/course/delete/{id}")
	public void delCourse(@PathVariable int id) {
		myServ.deleteCourse(id);
	}
	
}
