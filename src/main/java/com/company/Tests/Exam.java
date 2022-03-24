package com.company.Tests;


import org.junit.Test;
import static org.junit.Assert.*;
import com.company.Users.Student;
import com.company.Users.Teacher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import com.company.Users.Student;



public class Exam {

    static ArrayList<Exam> allExamens;
    private ArrayList<Question> Vragen;
    private String uniekeNaam;
    private Student student;
    private Teacher teacher;
    private String vak;
    private Integer cijferGehaald;

    private Exam(String uniekeNaam, Teacher teacher, Student student, String vak) {
        this.uniekeNaam = uniekeNaam;
        this.teacher = teacher;
        this.student = student;
        this.vak = vak;


    }

    public void save() {
        allExamens.add(this);

    }

    public void nakijken {


    }

    public String Cijferchecken(Integer cijferGehaald) {
        if (cijferGehaald > 5.5) {
            return "Geslaagd";
        } else {
            return "Gezakt";
        }
    }

}