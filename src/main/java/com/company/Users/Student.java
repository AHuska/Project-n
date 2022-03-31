package com.company.Users;
import java.util.ArrayList;
public class Student extends User{
    static private ArrayList<Student> alleStudenten;
     Student(String name,Integer identificatieCode ){
         this.name = name;
         this.identificatieCode= identificatieCode;
     }
    static public ArrayList <Student> GeefStudentenTerug(){
         return alleStudenten;
    }

    public void save() {
         alleStudenten.add(this);
    }
}