import com.company.Users.Student1;
import org.testng.annotations.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;
class StudentTest {

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