package org.launchcode.java.demos.lsn3classes1;

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

}
