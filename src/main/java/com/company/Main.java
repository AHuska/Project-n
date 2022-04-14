package com.company;

import com.company.Tests.Exam;
import com.company.Users.Student1;
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
    //starts the program
    public static void main(String[] args) {
	    //reads the json files with avalible exams, students and teachers
        Main.init();

        //basic login function to see which student/teacher does what
        Session.login();

        //redirects to the menu loop
        Menu.main();

        //saves the changes made to exams, students and teachers
        Main.shutdown();
    }

    private static void init() {
        try {
            // create Gson instance
            Gson gson = new Gson();

            // create a readers
            Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/json/students.json"));
            Reader reader2 = Files.newBufferedReader(Paths.get("src/main/resources/json/teacher.json"));
            Reader reader3 = Files.newBufferedReader(Paths.get("src/main/resources/json/exam.json"));

            // convert JSON string to the correct object
            List<Student1> students = new Gson().fromJson(reader, new TypeToken<List<Student1>>() {}.getType());
            List<Teacher> docenten = new Gson().fromJson(reader2, new TypeToken<List<Teacher>>() {}.getType());
            List<Exam> exams = new Gson().fromJson(reader3, new TypeToken<List<Exam>>() {}.getType());

            // save objects to their "all" arrays
            students.forEach((student) -> student.save());
            docenten.forEach((teacher) -> teacher.save());
            exams.forEach((exam) -> exam.save());

            // close reader
            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void shutdown() {
        try {
            // create object arrays
            List<Student1> studentList = Student1.GeefStudentenTerug();
            //List<Teacher> docentenList = Teacher.getAll();
            List<Exam> examList = Exam.getAllExamens();

            // create Gson instance
            Gson gson = new Gson();

            // create a writers
            File students = new File("src/main/resources/json/students.json");
            // File docenten = new File("src/main/resources/json/docenten.json");
            File exams = new File("src/main/resources/json/exams.json");

            Writer student = Files.newBufferedWriter(Paths.get("src/main/resources/json/students.json"));
            //Writer teacher = Files.newBufferedWriter(Paths.get("src/main/resources/json/teacher.json"));
            Writer exam = Files.newBufferedWriter(Paths.get("src/main/resources/json/exam.json"));

            if (students.createNewFile() && exams.createNewFile()) {
                System.out.println("The files is created with the name: " + students.getName()  + exams.getName());
            } else{
                System.out.println("changes to students, teachers and exams have been saved");
            }

            // convert lists to JSON files
            gson.toJson(studentList, student);
            //  gson.toJson(docentenList, teacher);
            gson.toJson(examList, exam);

            // close writer
            student.close();
            //teacher.close();
            exam.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
