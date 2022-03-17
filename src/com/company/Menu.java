package com.company;

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
        if (input == 1) {
            examens();

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
