package com.company.Users;
import java.util.ArrayList;
public class Student extends User{
    static private ArrayList<Student> AlleStudenten;
     Student(String name,Integer identificatieCode ){
         this.name = name;
         this.identificatieCode= identificatieCode;
     }
    static private ArrayList <Student> GeefStudentenTerug(){
         return AlleStudenten;
    }
}