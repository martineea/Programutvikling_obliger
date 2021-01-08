package programutvikling.oblig;

import java.util.*;

public class Student {
    
    private String firstName;
    private String lastName;
    private int studentID;
    private int age;

    public Student (String firstName, String lastName, int studentID, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = studentID;
        this.age = age;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public int getStudentID(){
        return studentID;
    }
    
    public int getAge(){
        return age;
    }
    
    // toString-metode som returnerer en beskrivende String
    @Override
    public String toString(){
        return "First name: "+firstName+"\n"+
               "Last name: "+lastName+"\n"+
               "Student ID: "+studentID+"\n"+
               "Age: "+age;
    }
    
     @Override
    public boolean equals(Object obj) {
    // like referansevariabler betyr at objektene må være like
    if (this == obj) return true;

    // hvis obj ikke er av typen Student, så kan de ikke være like
    if(getClass() != obj.getClass())
        return false;

    // Vi kan nå sammenlikne student id'ene til de to studentene
    Student other = (Student) obj;
    
    // sammenlikn de to student id'ene her og returner resultatet 
    return this.getStudentID() == other.getStudentID();
 }
    
    
}


 
   
    

