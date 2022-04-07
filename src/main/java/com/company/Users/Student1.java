package com.company.Users;

import com.company.Menu;

import java.util.Scanner;
import java.util.ArrayList;

public class Student1 extends User {
    static private ArrayList<Student1> alleStudenten = new ArrayList<Student1>();

    private ArrayList<String> vakken;
    private ArrayList<Integer> cijferLijst;

    public Student1(String name, Integer identificatieCode) {
        this.name = name;
        this.identificatieCode = identificatieCode;
        alleStudenten.add(this);

    }

    public void inschrijving() {
        Scanner scanner = new Scanner(System.in);
        Boolean active = true;
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


    static public ArrayList<Student1> GeefStudentenTerug() {
        return alleStudenten;
    }

    public ArrayList<String> getVakken() {
        return vakken;
    }

    public void save() {
        alleStudenten.add(this);
    }
}

