package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class SchoolPractice {
    public static void main(String[] args) {

        //created an instance of Student to be used in the Course class
        Student firstStudent = new Student ("Mariah Lightfoot", 1, 1, 4.0);
        System.out.println("Student Information: " + "\n" +
                "Name: " + firstStudent.getName() + "\n" +
                "ID: " + firstStudent.getStudentId() + "\n" +
                "Credit(s): " + firstStudent.getNumberOfCredits() + "\n" +
                "GPA: " + firstStudent.getGpa()+ "\n");

        //created an instance of the HashMap used in Course class and populated it using the Student class
        HashMap <String, Integer> firstStudentNameAndId = new HashMap<>();
        firstStudentNameAndId.put(firstStudent.getName(), firstStudent.getStudentId());

        //created an instance of the Course class
        //stored the course name in a new variable to be used by the Teacher class
        Course firstCourse = new Course ("Calculus", 1, firstStudentNameAndId);
        String firstTeacherSubject = firstCourse.getCourseName();
        System.out.println("Course Information: " + "\n" +
                "Name: " + firstCourse.getCourseName() + "\n" +
                "ID: " + firstCourse.getCourseId() + "\n" +
                "Students Enrolled: " + firstStudentNameAndId + "\n");

        Teacher firstTeacher = new Teacher ("Ethan", "Lightfoot", firstTeacherSubject, 3);
        System.out.println("Teacher Information: " + "\n" +
                "Name: " + firstTeacher.getFirstName()+ " " + firstTeacher.getLastName() + "\n" +
                "Courses: " + firstTeacherSubject + "\n" +
                "Experience: " + firstTeacher.getYearsTeaching());
    }
}

