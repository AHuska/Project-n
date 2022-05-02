import com.company.Tests.Question;
import org.testng.annotations.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class QuestionTest {

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
}


