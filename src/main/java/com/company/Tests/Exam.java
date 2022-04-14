package com.company.Tests;


import com.company.Session;
import com.company.Users.*;

import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

import com.company.Users.Student1;

import java.io.*;

<<<<<<< HEAD

public class Exam {
=======
>>>>>>> 6b629032776a452cad3fbf3d81adc528d3ecebc8

public class Exam implements Cloneable{
    private static ArrayList<Exam> allExamens = new ArrayList<Exam>();
    private ArrayList<Question> vragen;
    private String uniekeNaam;
    private Student1 student;
    private Teacher teacher;
    private String vak;
    private float cijferGehaald;

    public Exam(String uniekeNaam, Teacher teacher, String vak) {
        this.uniekeNaam = uniekeNaam;
        this.teacher = teacher;
        //this.student = student;
        this.vak = vak;
    }

<<<<<<< HEAD
    public void cijferCounting() {
        int count = 0;
        for (int i = 0; i < vragen.size(); i++) {
            if (Question.correct ==vragen.get(i).getAntwoord()){
                count++;

            }
        }
    }

        public void save () {
            allExamens.add(this);

        }

        public static ArrayList<Exam> getAllExamens () {
            return allExamens;
        }

        public void converterWeging () {
            int totaal = 0;
            int behaaldePunten = 0;
            for (Question i : vragen) {
                totaal += i.getWeight();
                if (i.getAntwoord() == i.getCorrect()) {
                    behaaldePunten = i.getPunten();
                }
                cijferGehaald = behaaldePunten / totaal * 9 + 1;
            }
=======
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
        int totaal = 0;
        int behaaldePunten = 0;
        for (Question i : vragen) {
            totaal += i.getWeight();
            if (i.getResult() == true) {
                behaaldePunten += i.getWeight();
            }

            cijferGehaald = behaaldePunten / totaal * 9 + 1;
>>>>>>> 6b629032776a452cad3fbf3d81adc528d3ecebc8
        }

<<<<<<< HEAD
        public String getUniekeNaam () {
            return uniekeNaam;
        }
=======
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
            ((Student1) Session.getUser()).setCijferLijst(current);
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
}
>>>>>>> 6b629032776a452cad3fbf3d81adc528d3ecebc8

}


    