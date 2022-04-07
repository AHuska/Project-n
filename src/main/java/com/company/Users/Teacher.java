package com.company.Users;

import com.company.Menu;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher extends User {
    static private ArrayList<Teacher> AlleTeachers;

    public Teacher(String name, Integer identificatieCode) {
        this.name = name;
        this.identificatieCode = identificatieCode;
    }

    static private ArrayList<Teacher> GeefTeachersTerug() {
        return AlleTeachers;
    }

    public static void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1) Zoek student op naam.");
        System.out.println("2) Zoek student op identificatiecode.");
        System.out.println("0) Exit");
        int input = scanner.nextInt();
        if (input == 1) {
            System.out.println("Voer de naam van de student in:");
            String studentName = scanner.nextLine();

        } else if (input == 2) {
            System.out.println("Voer de identificatiecode van de student in:");
            Integer studentID = scanner.nextInt();
        } else if (input == 0) {
            return;
        } else {
            System.out.println("Unexpected error. Please check www.hhs.nl for more info.");
        }
    }

    public static void generateStudent() {
        Boolean active = true;
        Scanner scanner = new Scanner(System.in);
        while(active) {
            System.out.println("Wat is de naam van de student?");
            String studentName = scanner.nextLine();
            System.out.println("Wat is de identificatiecode van de student?");
            Integer studentID = scanner.nextInt();
            System.out.println("New student name: " + studentName + ", New student ID: " + studentID);
            System.out.println("1) Accepteer nieuwe student.");
            System.out.println("2) Probeer opnieuw.");
            System.out.println("0) Exit.");
            int input = scanner.nextInt();
            if (input == 1) {
                System.out.println("Nieuwe student geaccepteerd.");
                Student1 student = new Student1(studentName, studentID);
                student.save();
                return;
            } else if (input == 2) {
                generateStudent();
            } else if (input == 0) {
                return;
            } else {
                System.out.println("Unexpected error. Please check www.hhs.nl for more info.");
            }
        }
    }


}

//

