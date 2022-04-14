package com.company;

import com.company.Users.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Session {
    private static Student1 user;

    public static void login() {
        Scanner scanner = new Scanner(System.in);

        while(user == null) {
            System.out.println("wie bent u ");
            Integer x = 0;

            for(Student1 i : Student1.GeefStudentenTerug()) {
                System.out.println(x + ") " + i.getName());
                x++;
            }
            System.out.println(x + ") ik ben nieuw");
            Integer type = Integer.parseInt(scanner.nextLine());

            if (type == x) {
                Teacher.generateStudent();
                user = Student1.GeefStudentenTerug().get(Student1.GeefStudentenTerug().size() - 1);
                System.out.println(user.getName());
            } else {
                try {
                    user = Student1.GeefStudentenTerug().get(type);
                } catch (Exception ex) {
                    user = null;
                    System.out.println("user bestaat niet");
                }
            }
        }
        
    }
    public static Student1 getUser() {
        return user;
    }
}
