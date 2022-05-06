import com.company.Main;
import com.company.Tests.Exam;
import com.company.Users.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.junit.Before;
import org.testng.annotations.Test;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;


public class MainTest {
    ArrayList<Student1> studenten = new ArrayList<>();
    ArrayList<Teacher> docenten = new ArrayList<>();
    ArrayList<Exam> exams = new ArrayList<>();

    @Before
    public void initialize() {
        try {
            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get("src/main/resources/json/students.json"));
            Reader reader2 = Files.newBufferedReader(Paths.get("src/main/resources/json/teacher.json"));
            Reader reader3 = Files.newBufferedReader(Paths.get("src/main/resources/json/exam.json"));

            List<Student1> students = new Gson().fromJson(reader, new TypeToken<List<Student1>>() {}.getType());
            List<Teacher> docenten = new Gson().fromJson(reader2, new TypeToken<List<Teacher>>() {}.getType());
            List<Exam> exams = new Gson().fromJson(reader3, new TypeToken<List<Exam>>() {}.getType());

        } catch (Exception ex) {
            fail("Unexpected error while loading json files");
        }
    }

    @Test
    void testInnit() {
        Main.init();
        if (!studenten.equals(Student1.GeefStudentenTerug()) && !docenten.equals(Teacher.geefTeachersTerug()) && !exams.equals(Exam.getAllExamens())) {
            fail("a json file is not properly loaded");
        }
    }

    @Test
    void testShutdown() {
        Student1 test = new Student1("test", 1234);

        Main.shutdown();
        Main.init();

        Integer last = Student1.GeefStudentenTerug().size() - 1;
        Student1 a = Student1.GeefStudentenTerug().get(last);


        if (a.equals(test)) {
            fail("test student is niet toegevoegt");
        }

        Student1.deleteTest(test);
        Main.shutdown();
    }

}
