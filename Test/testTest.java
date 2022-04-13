import com.company.Menu;
import com.company.Tests.Exam;
import com.company.Tests.Question;
import com.company.Users.Student1;
import com.company.Users.Teacher;
import org.junit.jupiter.api.Test;


import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class testTeacher {

    @Test
    void testGenerateStudent() {
        Teacher generate = new Teacher("bas", 3);
        ArrayList<Teacher> all = Teacher.geefTeachersTerug();
        assertEquals("bas", all.get(all.size() - 1).getName());
        if (all.size() > 1) {
            Teacher.ontsla(all.size() - 1);
        }
    }
}

class testStudent {

    @Test
    void testStudentInschrijving() {
        Student1 inschrijf = new Student1("x", 2121);
        //assertEquals("x" + 2121 , inschrijf.inschrijving());

    }
}

