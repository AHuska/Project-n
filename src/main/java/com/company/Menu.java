package com.company;

import com.company.Users.Teacher;

import java.util.Scanner;

public class Menu {

    public Menu() {
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

        switch (input) {
            case 1:
                examens();
                ;
                break;

            case 2:
                System.out.println("2) Lijst met studenten \n----------------------");
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
                break;

            default :
                System.out.println("Geen correcte invoer,probeer opnieuw.");

        }
    }


    private void examens() {
        String[] examen = {"Verkeersexamen_1", "Verkeersexamen_2"};
        System.out.println("1) Lijst met examens");
        for (int i = 0; i < examen.length; i++) {
            System.out.println(examen[i]);
        }


    }
}
