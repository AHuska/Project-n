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

        System.out.println("Menu");
        System.out.println("1) Lijst met examens");
        System.out.println("2) Lijst met studenten");
        System.out.println("3) Nieuwe student inschrijven");
        System.out.println("4) Student verwijderen");
        System.out.println("5) Examen afnemen");
        System.out.println("6) Is student geslaagd voor test?");
        System.out.println("7) Welke examens heeft student gehaald?");
        System.out.println("8) Welke student heeft de meeste examens gehaald?");
        System.out.println("0) Exit");
        System.out.println("Uw keuze:");

        int input = scanner.nextInt();

        //if statement voor invoeren van de cijfers
         /*if (input == 1) {

            examens();
        }
        else if(input == 2){
            System.out.println("2) Lijst met studenten");
        }
        else if(input == 3){
            System.out.println("3) Nieuwe student inschrijven");
        }
        else if(input == 4){
            System.out.println("4) Student verwijderen");
        }
        else if(input == 5){
            System.out.println("5) Examen afnemen");
        }
        else if(input == 6){
            System.out.println("6) Is student geslaagd voor test?");
        }
        else if(input == 7){
            System.out.println("7) Welke examens heeft student gehaald?");
        }
        else if(input == 8){
            System.out.println("8) Welke student heeft de meeste examens gehaald?");
        }
        else if(input == 0){
            System.out.println("0) Exit");
        }
        else {
            System.out.println("Geen correcte invoer,probeer opnieuw.");
        }
    }*/
        // switch statement voor invoeren van de cijfers
        switch (input) {
            case 1:
                System.out.println("1) Lijst met examens");
                ArrayList<Exam> exams = Exam.getAllExamens();
                System.out.println("1) Lijst met examens");
                for (Exam i : exams) {
                    System.out.println(i.getUniekeNaam());
                }
                Menu.main();
                break;

            case 2:
                System.out.println("2) Lijst met studenten \n----------------------");
                ArrayList<Student> studenten = Student.GeefStudentenTerug();

                for (Student i : studenten) {
                    System.out.println(i.getName());
                }
                Menu.main();
                break;
            case 3:
                System.out.println("3) Nieuwe student inschrijven \n-----------------------------");
                Teacher.generateStudent();
                break;

            case 4:
                System.out.println("4) Student verwijderen \n----------------------");
                Teacher.deleteStudent();
                break;

            case 5:
                System.out.println("5) Examen afnemen \n-----------------");
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
                return;
            default:
                System.out.println("Geen correcte invoer,probeer opnieuw.");

        }
    }
}
