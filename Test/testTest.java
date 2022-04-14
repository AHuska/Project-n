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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> main
       void testGenerateStudentAndDelete(){
    //Arrange


     // Act


     // Assert


    }
<<<<<<< HEAD

=======
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
>>>>>>> 6b629032776a452cad3fbf3d81adc528d3ecebc8
=======
>>>>>>> main
}


