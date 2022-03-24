package com.company;

import com.company.Users.Student;
import com.google.gson.Gson;

import java.io.File;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        new Menu();

        try {
            // create Student object
            Student floor = new Student("floor", 1);

            // create Gson instance
            Gson gson = new Gson();

            // create a writer
            File student = new File("src/main/resources/json/students.json");
            if (student.createNewFile()) {
                System.out.println("The file is created with the name: " + student.getName());
            } else{
                System.out.println("changes saved");
            }
            Writer writer = Files.newBufferedWriter(Paths.get("src/main/resources/json/students.json"));

            // convert book object to JSON file
            gson.toJson(floor, writer);

            // close writer
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
