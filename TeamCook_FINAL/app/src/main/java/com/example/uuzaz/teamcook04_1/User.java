package com.example.uuzaz.teamcook04_1;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {


    public String  name, school, major, grade, specialty, awards;

    public User(){

    }
    public User(String name,String school,String major,String grade,String specialty,String awards){
        this.name = name;
        this.school = school;
        this.major = major;
        this.grade = grade;
        this.specialty = specialty;
        this.awards = awards;
    }
}
