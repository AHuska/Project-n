import com.company.Menu;
import com.company.Tests.Exam;
import com.company.Tests.Question;
import com.company.Users.Student1;
import com.company.Users.Teacher;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class testTeacher {

    @Test
    void testGenerateStudentAndDelete() {
        Teacher generate = new Teacher("bas", 3);
        assertEquals("bas", generate.getName());

    }

}

class testStudent {

    @Test
    void testStudentInschrijving() {
        Student1 inschrijf = new Student1("x", 2121);
        //assertEquals("x" + 2121 , inschrijf.inschrijving());

    }
}

