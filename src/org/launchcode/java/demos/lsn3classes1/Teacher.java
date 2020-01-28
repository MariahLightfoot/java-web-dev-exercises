package org.launchcode.java.demos.lsn3classes1;

public class Teacher {

    private String firstName;
    private String lastName;
    private String subject;
    private float yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, float yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSubject() {
        return subject;
    }

    public float getYearsTeaching() {
        return yearsTeaching;
    }

    //same question for setters here
    private void setFirstName(String aFirstName){
        firstName = aFirstName;
    }

    public void setLastName(String aLastName){ lastName = aLastName; }

    public void setYearsTeaching(float aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }
}


