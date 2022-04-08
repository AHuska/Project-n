package com.company.Tests;


import com.company.Users.*;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import com.company.Users.Student1;
import java.io.*;


public class Exam {
    private static ArrayList<Exam> allExamens = new ArrayList<Exam>();
    private ArrayList<Question> vragen;
    private String uniekeNaam;
    private Student1 student;
    private Teacher teacher;
    private String vak;
    private float cijferGehaald;

    public Exam(String uniekeNaam, Teacher teacher, Student1 student, String vak) {
        this.uniekeNaam = uniekeNaam;
        this.teacher = teacher;
        this.student = student;
        this.vak = vak;
    }

    public void save() {
        allExamens.add(this);
    }

    public static ArrayList<Exam> getAllExamens() {
        return allExamens;
    }

    public void converterWeging() {
        int totaal = 0;
        int behaaldePunten = 0;
        for ( Question i : vragen) {
            totaal += i.getWeight();
            if (i.getResult() == true){
               behaaldePunten += i.getWeight();

            }
            cijferGehaald = behaaldePunten/totaal * 9 + 1;
        }
    }

    public String getUniekeNaam() {
        return uniekeNaam;
   }
}



    