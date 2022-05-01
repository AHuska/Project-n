import com.company.Menu;
import com.company.Tests.Exam;
import com.company.Tests.Question;
import com.company.Users.Student1;
import com.company.Users.Teacher;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class testQuestion {


    @Test
    void testSettype() {

        //Arrange
        Question vraag = new Question();
        InputStream stdin = System.in;
        System.setIn(new ByteArrayInputStream(("3\nbla\nja\n1").getBytes()));
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(byteArrayOutputStream);
        PrintStream stdout = System.out;
        System.setOut(ps);

        // Act
        vraag.setType();
        System.setIn(stdin);
        System.setOut(stdout);

        // Assert
        assertEquals("Ja of nee vragen", vraag.getType());
    }


    class testStudent1 {

        @Test
        void testInschrijving() {
            //Arrange
            Student1 student = new Student1("test",2);
            InputStream stdin = System.in;
            System.setIn(new ByteArrayInputStream(("rekenen\n2\n").getBytes()));
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            PrintStream ps = new PrintStream(byteArrayOutputStream);
            PrintStream stdout = System.out;
            System.setOut(ps);

            //Act
            student.inschrijving();
            System.setIn(stdin);
            System.setOut(stdout);
            //Assert
            assertEquals("rekenen", student.getVakken().get(0));
        }
    }
}






