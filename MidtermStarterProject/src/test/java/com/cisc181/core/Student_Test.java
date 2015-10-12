package com.cisc181.core;

import static org.junit.Assert.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.cisc181.eNums.eMajor;

public class Student_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ArrayList<Course> courseList = new ArrayList<Course>();
		Course course1 = new Course("CISC181",90,eMajor.COMPSI);
		courseList.add(course1);
		Course course2 = new Course("ECON423",91,eMajor.BUSINESS);
		courseList.add(course2);
		Course course3 = new Course("FINC312",92,eMajor.BUSINESS);
		courseList.add(course3);
		
		Calendar start = Calendar.getInstance();
		start.set(2015, 9, 1);
		Date fstartd = (Date) start.getTime();
		
		Calendar end = Calendar.getInstance();
		end.set(2015, 12, 19);
		Date fendd = (Date) end.getTime();
		
		Calendar start2 = Calendar.getInstance();
		start2.set(2015, 2, 9);
		Date sstartd = (Date) start2.getTime();
		
		Calendar end2 = Calendar.getInstance();
		end2.set(2015, 5, 27);
		Date sendd = (Date) end2.getTime();
		
	
		ArrayList<Semester> semesterList = new ArrayList<Semester>();
		Semester fall = new Semester(fstartd, fendd);
		semesterList.add(fall);
		Semester spring = new Semester(sstartd,sendd);
		semesterList.add(fall);
		
		ArrayList<Section> sectionList = new ArrayList<Section>();
		Section section1 = new Section(course1.getCourseID(), null, null, 0);
		sectionList.add(section1);
		Section section2 = new Section(course1.getCourseID(), null, null, 0);
		sectionList.add(section2);
		Section section3 = new Section(course2.getCourseID(), null, null, 0);
		sectionList.add(section3);
		Section section4 = new Section(course2.getCourseID(), null, null, 0);
		sectionList.add(section4);
		Section section5 = new Section(course3.getCourseID(), null, null, 0);
		sectionList.add(section5);
		Section section6 = new Section(course3.getCourseID(), null, null, 0);
		sectionList.add(section6);
		
		Calendar cal = Calendar.getInstance();
		cal.set(1991, 3, 12);
		Date dob = (Date) cal.getTime();
		
		
		ArrayList<Student> studentList = new ArrayList<Student>();
		Student student1 = new Student("Bob","M","Smith",dob,eMajor.BUSINESS,"120 Walnut St","508-111-2222","bob.smith@gmail.com");
		studentList.add(student1);
		Student student2 = new Student("Rob","R","Cohen",dob,eMajor.COMPSI,"130 Walnut St","508-333-4444","rob.cohen@gmail.com");
		studentList.add(student2);
		Student student3 = new Student("Bill","M","Smith",dob,eMajor.CHEM,"140 Walnut St","508-111-5555","bill.smith@gmail.com");
		studentList.add(student3);
		Student student4 = new Student("Fred","R","Cohen",dob,eMajor.NURSING,"150 Walnut St","508-333-6666","fred.cohen@gmail.com");
		studentList.add(student4);
		Student student5 = new Student("Craig","M","Smith",dob,eMajor.PHYSICS,"160 Walnut St","508-111-7777","craig.smith@gmail.com");
		studentList.add(student5);
		Student student6 = new Student("Sam","R","Cohen",dob,eMajor.BUSINESS,"170 Walnut St","508-333-8888","sam.cohen@gmail.com");
		studentList.add(student6);
		Student student7 = new Student("Tim","M","Smith",dob,eMajor.CHEM,"180 Walnut St","508-111-9999","tim.smith@gmail.com");
		studentList.add(student7);
		Student student8 = new Student("Matt","R","Cohen",dob,eMajor.COMPSI,"190 Walnut St","508-777-4444","matt.cohen@gmail.com");
		studentList.add(student8);
		Student student9 = new Student("Emma","M","Smith",dob,eMajor.BUSINESS,"220 Walnut St","508-888-2222","emma.smith@gmail.com");
		studentList.add(student9);
		Student student10 = new Student("Jenna","R","Cohen",dob,eMajor.NURSING,"230 Walnut St","508-333-4444","jenna.cohen@gmail.com");
		studentList.add(student10);
	}

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testEnrollment() {
		
	}

}
