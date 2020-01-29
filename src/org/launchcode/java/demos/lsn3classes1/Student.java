package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Student {

    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;


    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getName(){
        return name;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getNumberOfCredits(){
        return numberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    //do I even need setters? don't constructors do the same thing here?
    //would this be for updating the credits and gpa in the future?
    //probably don't need setters fot name and studentId
    private void setName(String aName){
        name = aName;
    }

    private void setStudentId(int aStudentId){
        studentId = aStudentId;
    }

    public void setNumberOfCredits(int aNumberOfCredits){
        numberOfCredits =  aNumberOfCredits;
    }

    public void setGpa(double aGpa){
        gpa = aGpa;
    }

    public String getGradeLevel(){

        if(numberOfCredits == 0 && numberOfCredits <= 29){
            return name + " is a Freshman.";
        } else if (numberOfCredits >= 30 && numberOfCredits <= 59){
            return name + " is a Sophomore.";
        } else if (numberOfCredits >=60 && numberOfCredits <=89){
            return name + " is a Junior.";
        } else {
            return name + " is a Senior.";
        }

    }

    public double addGrade(int courseCredits, double grade){

        //what student has now
        double currentTotalQualityScore = gpa * numberOfCredits;

        //add new courses
        //for each course take grade * credits
        double newQualityScore = grade * courseCredits;
        int totalOfNumberOfCredits = numberOfCredits + courseCredits;

        //calculating new gpa
        return gpa = (currentTotalQualityScore + newQualityScore)/totalOfNumberOfCredits;

    }

}
