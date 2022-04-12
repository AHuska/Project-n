package com.company;

import com.company.Tests.Exam;
import com.company.Users.Student;
import com.company.Users.Student1;
import com.company.Users.Teacher;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main() {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Boolean active = true;

        while (active) {
            System.out.println("Menu");
            System.out.println("1) Examen afnemen");
            if (Session.getUser().getClass().getSimpleName().equals("Teacher")) {
                System.out.println("2) Lijst met examens");
                System.out.println("3) Lijst met studenten");
                System.out.println("4) Nieuwe student inschrijven");
                System.out.println("5) Student verwijderen");
                System.out.println("6) Is student geslaagd voor test?");
                System.out.println("7) Welke examens heeft student gehaald?");
                System.out.println("8) Welke student heeft de meeste examens gehaald?");
            }


            System.out.println("0) Exit");
            System.out.println("Uw keuze:");

            Integer input = scanner.nextInt();
            switch (input) {
                case 2:
                    System.out.println("2) Lijst met examens");
                    ArrayList<Exam> exams = Exam.getAllExamens();
                    for (Exam i : exams) {
                        System.out.println(i.getUniekeNaam());
                    }
                    Menu.main();
                    break;

                case 3:
                    System.out.println("3) Lijst met studenten \n----------------------");
                    ArrayList<Student> studenten = Student.GeefStudentenTerug();

                    for (Student i : studenten) {
                        System.out.println(i.getName() + " (" + i.getIdentificatieCode() + ")");
                    }
                    Menu.main();
                    break;

                case 4:
                    System.out.println("4) Nieuwe student inschrijven \n-----------------------------");
                    Teacher.generateStudent();
                    break;

                case 5:
                    System.out.println("5) Student verwijderen \n----------------------");
                    Teacher.deleteStudent();
                    break;

                case 1:
                    System.out.println("1) Examen afnemen \n-----------------");
                    Student1 student = (Student1) Session.getUser();
                    Boolean show = true;
                    ArrayList<Exam> avalible = new ArrayList<>();

                    while (show) {
                        int i = 1;
                        for (Exam exam : Exam.getAllExamens()) {
                            if (student.getVakken().contains(exam.getVak())) {
                                System.out.println(i + ") " + exam.getUniekeNaam());
                                avalible.add(exam);
                                i++;
                            }
                        }
                        System.out.println("0) exit");
                        Integer choice = scanner.nextInt();
                        if (choice == 0) {
                            show = false;
                        } else if (choice > 0 && choice <= avalible.size()) {
                            avalible.get(i - 1).makeExam();
                            show = false;
                        } else {
                            System.out.println("input word niet herkend");
                        }
                    }
                    break;

                case 6:
                    System.out.println("6) Is student geslaagd voor test? \n---------------------------------");
                    break;

                case 7:
                    System.out.println("7) Welke examens heeft student gehaald? \n---------------------------------------\n");

                    break;

                case 8:
                    System.out.println("8) Welke student heeft de meeste examens gehaald? \n-------------------------------------------------");
                    break;

                case 0:
                    System.out.println("0) Exit \n-------");
                    active = false;
                    break;

                default:
                    System.out.println("Geen correcte invoer,probeer opnieuw.");
            }
        }
    }
}
