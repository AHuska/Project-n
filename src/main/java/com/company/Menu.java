package com.company;

import com.company.Tests.Exam;
import com.company.Users.Student1;
import com.company.Users.Teacher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Menu {

    public static void main() {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Boolean active = true;

        while (active) {
            System.out.println("Menu");
            System.out.println("1) Examen afnemen");
            //if (Session.getUser().getClass().getSimpleName().equals("Teacher")) {
                System.out.println("2) Lijst met examens");
                System.out.println("3) Lijst met studenten");
                System.out.println("4) Nieuwe student inschrijven");
                System.out.println("5) Student verwijderen");
                System.out.println("6) Is student geslaagd voor test?");
                System.out.println("7) Welke examens heeft student gehaald?");
                System.out.println("8) Welke student heeft de meeste examens gehaald?");
            //}

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
                    break;

                case 3:
                    System.out.println("3) Lijst met studenten \n----------------------");
                    ArrayList<Student1> studenten = Student1.GeefStudentenTerug();

                    for (Student1 i : studenten) {
                        System.out.println(i.getName() + " (" + i.getIdentificatieCode() + ")");
                    }
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
                    System.out.println("6) Is deze student geslaagd voor deze test? \n---------------------------------");
                    ArrayList<Student1> studentList = Student1.GeefStudentenTerug();
                    ArrayList<Exam> examList = Exam.getAllExamens();
                    Integer y = 0;

                    for (Student1 i : studentList) {
                        System.out.println(y + ") " + i.getName() + " (" + i.getIdentificatieCode() + ")");
                    }
                    Student1 person = studentList.get(scanner.nextInt());
                    y = 0;
                    for (Exam i : examList) {
                        System.out.println(y + ") " + i.getUniekeNaam());
                    }
                    Exam test = examList.get(scanner.nextInt());
                    if (!person.getCijferLijst().containsKey(test.getUniekeNaam())){
                        System.out.println("de student heeft dit examen niet gemaakt");
                    } else {
                        System.out.println(person.getCijferLijst().get(test.getUniekeNaam()));
                    }
                    break;

                case 7:
                    System.out.println("7) Welke examens heeft student gehaald? \n---------------------------------------\n");
                    ArrayList<Student1> studentList1 = Student1.GeefStudentenTerug();
                    ArrayList<Exam> examList1 = Exam.getAllExamens();
                    Integer x = 0;

                    for (Student1 i : studentList1) {
                        System.out.println(x + ") " + i.getName() + " (" + i.getIdentificatieCode() + ")");
                    }
                    Student1 person1 = studentList1.get(scanner.nextInt());
                    for (Map.Entry<String, Float> entry : person1.getCijferLijst().entrySet()) {
                        String key = entry.getKey();
                        Float value = entry.getValue();
                        if (value >= 5.5) {
                            System.out.println(key + " (" + value + ")");
                        }
                    }
                    break;

                case 8:
                    System.out.println("8) Welke student heeft de meeste examens gehaald? \n-------------------------------------------------");
                    ArrayList<Student1> studentList2 = Student1.GeefStudentenTerug();
                    String highScore = "nobody";
                    Integer reccord = 0;

                    for (Student1 i : studentList2) {
                        Integer punten = 0;
                        for (Map.Entry<String, Float> entry : i.getCijferLijst().entrySet()) {
                            String key = entry.getKey();
                            Float value = entry.getValue();
                            if (value >= 5.5) {
                                punten++;
                            }
                        }
                        if (punten > reccord) {
                            highScore = i.getName();
                            reccord = punten;
                        }
                    }
                    System.out.println(highScore + " (" + reccord + ")");
                    
                    break;
                case 9:
                    System.out.println("naam van examen");
                    String filler = scanner.nextLine();
                    String bla = scanner.nextLine();
                    System.out.println("vak");
                    String bla2 = scanner.nextLine();
                    Exam a = new Exam(bla, bla2);

                    a.addQuestion();
                    a.addQuestion();
                    a.addQuestion();

                    a.save();
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
