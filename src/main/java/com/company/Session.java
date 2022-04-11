package com.company;

import com.company.Users.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Session {
    private static Object user;

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        while(user == null) {
            System.out.println("uw bent een ? \n 1) student \n 2) docent \n 0) exit");
            Integer type = Integer.parseInt(scanner.nextLine());
            System.out.println("uw naam is ?");
            String name = scanner.nextLine();
            System.out.println("uw identificatie code is ?");
            Integer id = Integer.parseInt(scanner.nextLine());

            if (type == 1) {
                ArrayList<Student1> students = Student1.GeefStudentenTerug();
                for (Student1 student : students) {
                    if (student.getName().equals(name) && student.getIdentificatieCode() == id) {
                        user = student;
                        System.out.println(user.getClass().getSimpleName());
                    }
                }
            } else if (type == 2) {
                ArrayList<Teacher> teachers = Teacher.geefTeachersTerug();
                for (Teacher teacher : teachers) {
                    if (teacher.getName().equals(name) && teacher.getIdentificatieCode() == id) {
                        user = teacher;
                        System.out.println("login succes");
                    }
                }
            } else if (type == 3) {
                user = new Object();
            }
        }
        
    }
    public static Object getUser() {
        return user;
    }
}
