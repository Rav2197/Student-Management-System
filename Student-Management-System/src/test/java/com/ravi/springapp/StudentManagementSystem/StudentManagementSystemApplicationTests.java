package com.ravi.springapp.StudentManagementSystem;

import com.ravi.springapp.StudentManagementSystem.coursesService.Courses;
import com.ravi.springapp.StudentManagementSystem.jpa.CoursesRepository;
import com.ravi.springapp.StudentManagementSystem.jpa.StudentsRepository;
import com.ravi.springapp.StudentManagementSystem.studentservice.Students;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
class StudentManagementSystemApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	StudentsRepository studentsRepository;

	@Autowired
	CoursesRepository coursesRepository;

	/*@Test
	public void testCreateStudent(){
		Students student1 = new Students();
		student1.setStudentId(12345);
		student1.setStudentName("Jayshree");
		student1.setPhoneNumber("7004290908");
		student1.setDateOfBirth(LocalDate.now().minusYears(34));
		studentsRepository.save(student1);
		assertNotNull(studentsRepository);
	}

	@Test
	public void testCourseCreation(){
		Courses courses = new Courses();
		courses.setcourseId(123);
		courses.setCourseName("Spring boot ");
		courses.setCourseCost(6000);
		courses.setCourseDescription("Spring boot JPA ny 28 min");
		coursesRepository.save(courses);
		assertNotNull(coursesRepository);
	}*/
	// find all students
	@Test
	public void readAllStudents(){
		List<Students> students = studentsRepository.findAll();
	}
	// find all courses
	@Test
	public void readAllCourses(){
		List<Courses> courses = coursesRepository.findAll();
	}

	/*// test students by Id
	@Test
	public  void testStudentbyId(){
		Students student1 = studentsRepository.findById(102).get();
		System.out.println(student1);
		assertEquals("Jayshree", student1.getStudentName());
	}

	// Test Course by id
	@Test
	public  void testCoursebyId(){
		Courses courses = coursesRepository.findById(302).get();
		System.out.println(courses);
		assertEquals("Spring boot", courses.getCourseName());
	}

	// Update test case
	@Test
	public void testUpdateForStudent(){
		Students students = studentsRepository.findById(102).get();
		students.setPhoneNumber("0223029772");
		studentsRepository.save(students);
		assertNotEquals("7004290831", studentsRepository.findById(102).get().getPhoneNumber());
	}

	@Test
	public void testUpdteForCourse(){
		Courses courses = coursesRepository.findById(302).get();
		courses.setCourseDescription("Spring boot is used for building quick application");
		coursesRepository.save(courses);
		assertNotEquals(5000,coursesRepository.findById(302).get().getCourseCost());
	}

	// delete the test

	@Test
	public void deleteStudentTest(){
		Students students = studentsRepository.findById(502).get();
		studentsRepository.deleteById(502);
	}

	@Test
	public void deleteCourse(){
		coursesRepository.deleteById(302);

	}
*/
}
