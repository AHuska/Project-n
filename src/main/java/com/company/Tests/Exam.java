package com.company.Tests;


import com.company.Session;
import com.company.Users.*;

import java.util.HashMap;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

import com.company.Users.Student1;

import java.io.*;


public class Exam implements Cloneable{
    private static ArrayList<Exam> allExamens = new ArrayList<Exam>();
    private ArrayList<Question> vragen = new ArrayList<>();
    private String uniekeNaam;
    private Student1 student;
    private String vak;
    private float cijferGehaald;

    public Exam(String uniekeNaam, String vak) {
        this.uniekeNaam = uniekeNaam;
        //this.student = student;
        this.vak = vak;
    }

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void save() {
        allExamens.add(this);
    }

    public static ArrayList<Exam> getAllExamens() {
        return allExamens;
    }

    public void converterWeging() {
        Integer totaal = 0;
        Integer behaaldePunten = 0;
        for (Question i : vragen) {
            totaal += i.getWeight();
            if (i.getResult() == true) {
                behaaldePunten += i.getWeight();
            }
        }

        cijferGehaald = behaaldePunten / totaal * 9 + 1;
    }

    public String getUniekeNaam() {
        return uniekeNaam;
    }

    public void makeExam() {
        Scanner scanner = new Scanner(System.in);
        try {
            Exam current = (Exam) this.clone();
            current.setStudent((Student1) Session.getUser());
            for (Question vraag : current.vragen) {
                System.out.println("type: " + vraag.getType() + "\n" + vraag.getVraag());
                if (vraag.getType().equals("Meerkeuzevragen")) {
                    for (String option : vraag.getOptions()) {
                        System.out.println(option);
                    }
                }
                String input = scanner.nextLine();
                vraag.setAnswer(input);
            }
            current.converterWeging();
            Session.getUser().setCijferLijst(current);
            System.out.println("gefeliciteerd je heb een " + current.getCijferGehaald() + " behaald");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }


    }

    public String getVak() {
        return vak;
    }

    public float getCijferGehaald() {
        return cijferGehaald;
    }

    public void setStudent(Student1 student) {
        this.student = student;
    }
    public void addQuestion() {
        Question a = new Question();
        a.setType();
        vragen.add(a);
    }
}


    