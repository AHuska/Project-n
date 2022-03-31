package com.company.Tests;


import org.junit.Test;
import static org.junit.Assert.*;
import com.company.Users.*;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;
import com.company.Users.Student1;
import java.io.*;


public class Exam {

    static ArrayList<Exam> allExamens;
    private ArrayList<Question> Vragen;
    private String uniekeNaam;
    private Student1 student;
    private Teacher teacher;
    private String vak;
    private Integer cijferGehaald;

    private Exam(String uniekeNaam, Teacher teacher, Student1 student, String vak) {
        this.uniekeNaam = uniekeNaam;
        this.teacher = teacher;
        this.student = student;
        this.vak = vak;


    }
    static void aanmaken() {
        System.out.println("Wat voor examen wil je?");
        Scanner input = new Scanner(System.in);
        input.nextLine();




    }
    public void initalizearray(){
        ArrayList<Exam> initialize = new ArrayList<Exam>(){
            


        };


    }





    public void save() {
        allExamens.add(this);

    }


    public static ArrayList<Exam> getAllExamens() {
        return  allExamens;
    }



    public String Cijferchecken(Integer cijferGehaald) {
        if (cijferGehaald > 5.5) {
            return "Geslaagd";
        } else {
            return "Gezakt";
        }
    }
  }



    