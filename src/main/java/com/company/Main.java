package com.company;

import com.company.Users.Student;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Main.init();

        Menu.main();

        Main.shutdown();
    }

    private static void init() {
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a reader
            Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/json/students.json"));

            // convert JSON string to User object
            List<Student> students = new Gson().fromJson(reader, new TypeToken<List<Student>>() {}.getType());

            // print user object
            students.forEach((Student) -> System.out.println(Student.getName()));

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void shutdown() {
        try {
            // create Student object
            List<Student> studentList = Arrays.asList(
                    new Student("floor", 1),
                    new Student("alexander", 2),
                    new Student("shuang", 3),
                    new Student("waihong", 4),
                    new Student("tommy", 5)
            );

            // create Gson instance
            Gson gson = new Gson();

            // create a writer
            File students = new File("src/main/resources/json/students.json");

            Writer writer = Files.newBufferedWriter(Paths.get("src/main/resources/json/students.json"));

            if (students.createNewFile()) {
                System.out.println("The file is created with the name: " + students.getName());
            } else{
                System.out.println("changes to students saved");
            }


            // convert student list to JSON file
            gson.toJson(studentList, writer);

            // close writer
            writer.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
