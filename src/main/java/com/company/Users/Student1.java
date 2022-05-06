package com.company.Users;

import com.company.Tests.Exam;

import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;

public class Student1 extends User {
    static private ArrayList<Student1> alleStudenten = new ArrayList<Student1>();

    private ArrayList<String> vakken = new ArrayList<>();
    private HashMap<String, Float> cijferLijst;

    public Student1(String name, Integer identificatieCode) {
        this.name = name;
        this.identificatieCode = identificatieCode;
        alleStudenten.add(this);
    }

    public static void deleteTest(Student1 test) {
        alleStudenten.remove(test);
    }

    public void inschrijving() {
        boolean active = true;
        Scanner scanner = new Scanner(System.in);
        while (active) {

            System.out.println("Voor welk vak wilt u zich inschrijven? ");
            String invoer = scanner.nextLine();
            vakken.add(invoer);
            System.out.println("Uw vak is toegevoegd, wilt u meer toevoegen?");
            System.out.println("1) ja");
            System.out.println("2) nee");
            int retry = scanner.nextInt();
            if (retry == 2) {
                active = false;
            } else {
                System.out.println("Uw invoer wordt niet herkent.");
            }
        }
    }

    public void setVakken() {
        Scanner scanner = new Scanner(System.in);
        Boolean active = true;

        while (active) {
            System.out.println("voor welk vak wilt u zich inschrijven");
            String input = scanner.nextLine();
            if (vakken == null) {
                vakken = new ArrayList<>();
            }
            vakken.add(input);
            System.out.println("wilt u meer vakken toevoegen");
            Integer choice = scanner.nextInt();
            if (choice == 2) {
                active = false;
            }
        }
    }

    static public ArrayList<Student1> GeefStudentenTerug() {
        return alleStudenten;
    }

    public ArrayList<String> getVakken() {
        return vakken;
    }

    public void save() {
        if (alleStudenten.contains(this)) {

        } else {
            alleStudenten.add(this);
        }
    }

    public void setCijferLijst(Exam exam) {
        String examName =exam.getUniekeNaam();
        Float grade = exam.getCijferGehaald();
        if (cijferLijst==null) {
            cijferLijst = new HashMap<String, Float>();;
        }
        this.cijferLijst.put(examName, grade);
    }

    public HashMap<String, Float> getCijferLijst() {
        return cijferLijst;
    }
}

