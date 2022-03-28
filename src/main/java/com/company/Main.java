package com.company;

import com.company.Tests.Exam;
import com.company.Users.Student;
import com.company.Users.Teacher;
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

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void shutdown() {
        try {
            // create object arrays
            List<Student> studentList = Student.GeefStudentenTerug();
            List<Teacher> docenteList = Teacher.getAll();
            List<Exam> examList = Exam.getAll();

            // create Gson instance
            Gson gson = new Gson();

            // create a writers
            File students = new File("src/main/resources/json/students.json");
            File docenten = new File("src/main/resources/json/docenten.json");
            File exams = new File("src/main/resources/json/exams.json");

            Writer student = Files.newBufferedWriter(Paths.get("src/main/resources/json/students.json"));
            Writer teacher = Files.newBufferedWriter(Paths.get("src/main/resources/json/teacher.json"));
            Writer exam = Files.newBufferedWriter(Paths.get("src/main/resources/json/exam.json"));

            if (students.createNewFile() && docenten.createNewFile() && exams.createNewFile()) {
                System.out.println("The files is created with the name: " + students.getName() + docenten.getName() + exams.getName());
            } else{
                System.out.println("changes to students, teachers and exams have been saved");
            }

            // convert lists to JSON files
            gson.toJson(studentList, student);
            gson.toJson(docenteList, teacher);
            gson.toJson(examList, exam);

            // close writer
            student.close();
            teacher.close();
            exam.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
