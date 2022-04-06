package com.company.Users;

import com.company.Menu;
import org.junit.Test;

import java.util.Scanner;
import java.util.ArrayList;

public class Student1 extends User {
    static private ArrayList<Student1> alleStudenten = new ArrayList<Student1>();

    private ArrayList<String> vakken;
    private ArrayList<Integer> cijferLijst;

    Student1(String name, Integer identificatieCode) {
        this.name = name;
        this.identificatieCode = identificatieCode;
        alleStudenten.add(this);

    }

    public void inschrijving() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Voor welk vak wilt u zich inschrijven? ");
        String invoer = scanner.nextLine();
        vakken.add(invoer);
        System.out.println("Uw vak is toegevoegd, wilt u meer toevoegen?");
        System.out.println("1) ja");
        System.out.println("2) nee");
        int retry = scanner.nextInt();
       do {
          Menu.main();
       }  // moet een while loop worden.
         while  (retry == 2);

        do {
            this.inschrijving();
        }
         while (retry == 1);
         {
        do {
            System.out.println("Uw invoer wordt niet herkent.");
            Menu.main();
        }
            while(retry !=2);
             do {
                 System.out.println("Uw invoer wordt niet herkent.");
                 Menu.main();
             }
             while(retry !=1);
        }
    }


    static private ArrayList<Student1> GeefStudentenTerug() {
        return alleStudenten;
    }

    public ArrayList<String> getVakken() {
        return vakken;
    }


}