package com.jnit.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jnit.app.model.Course;
import com.jnit.app.service.CourseService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(value = "courses", method = RequestMethod.OPTIONS)
public class CourseController {

	@Autowired
	private CourseService courseService;

	@PostMapping
	public Course createCourse(@RequestBody Course course) throws Exception {
		System.out.println("hello");
		System.out.println(course.getName());
		return courseService.createCourse(course);
	}

	@PutMapping
	public Course updateCourse(@RequestBody Course course) throws Exception {
		return courseService.updateCourse(course);
	}

	@DeleteMapping(value="/{courseId}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable("courseId") String courseId) throws Exception {
		courseService.deleteCourse(courseId);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}

	@GetMapping
	public List<Course> getAllCourses() throws Exception {
		System.out.println("i am in get");
		return courseService.getAllCourses();
	}
	
	@GetMapping("/{courseId}")
	public Course getCourseById(@PathVariable("courseId")String courseId) throws Exception{
		return courseService.getCourseById(courseId);
	}
}
