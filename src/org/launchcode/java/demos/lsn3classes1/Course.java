package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {

    private String courseName;
    private int courseId;
    private HashMap studentEnrolledInCourse = new HashMap<>();
    private int studentCourseGrade;

    public Course (String courseName, int courseId, HashMap studentEnrolledInCourse){
        this.courseName = courseName;
        this.courseId = courseId;
        this.studentEnrolledInCourse = studentEnrolledInCourse;
    }

    public Course (String courseName, int courseId, HashMap studentEnrolledInCourse, int studentCourseGrade){
        this(courseName, courseId, studentEnrolledInCourse);
        this.studentCourseGrade = studentCourseGrade;
    }


    public String getCourseName(){
        return courseName;
    }

    public int getCourseId(){
        return courseId;
    }

    public HashMap getStudentEnrolledInCourse(){
        return studentEnrolledInCourse;
    }

    public int getStudentCourseGrade() { return studentCourseGrade; }

    //same question about these setters
    private void setCourseName(String aCourseName){
        courseName = aCourseName;
    }

    private void setCourseId(int aCourseId){
        courseId = aCourseId;
    }

    public void setStudentsEnrolledInCourse(HashMap aStudentEnrolledInCourse){ studentEnrolledInCourse = aStudentEnrolledInCourse; }

    public void setStudentCourseGrade(int aStudentCourseGrade){ studentCourseGrade = aStudentCourseGrade; }

}
