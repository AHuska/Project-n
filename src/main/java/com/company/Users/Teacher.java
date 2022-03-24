package com.company.Users;
import java.util.ArrayList;
public class Teacher extends User{
    static private ArrayList<Teacher> AlleTeachers;
    Teacher(String name, Integer identificatieCode) {
        this.name = name;
        this.identificatieCode = identificatieCode;
    }
    static private ArrayList <Teacher> GeefTeachersTerug(){
        return AlleTeachers;
    }

    //

}
