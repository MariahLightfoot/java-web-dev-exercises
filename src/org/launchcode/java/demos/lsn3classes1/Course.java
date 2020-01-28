package org.launchcode.java.demos.lsn3classes1;

import java.util.HashMap;

public class Course {

    private String courseName;
    private int courseId;
    private HashMap studentEnrolledInCourse = new HashMap<>();

    public Course (String courseName, int courseId, HashMap studentEnrolledInCourse){
        this.courseName = courseName;
        this.courseId = courseId;
        this.studentEnrolledInCourse = studentEnrolledInCourse;
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


    //same question about these setters
    private void setCourseName(String aCourseName){
        courseName = aCourseName;
    }

    private void setCourseId(int aCourseId){
        courseId = aCourseId;
    }

    public void setStudentsEnrolledInCourse(HashMap aStudentEnrolledInCourse){
        studentEnrolledInCourse = aStudentEnrolledInCourse;
    }
}
