import com.company.Tests.Question;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;


class TeacherTest {
    @Test
       void questionTypeTest(){
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

        Boolean expected = vraag.getType().equals("Ja of nee vragen");

        // Assert
        assertEquals("Ja of nee vragen" , vraag.getType());
    }

//    @Test
//    class testQuestion{
//
//        void testSettype(){
//            //Arrange
//            Question vraag = mock(Question.class);
//            ByteArrayOutputStream bo = new ByteArrayOutputStream();
//            System.setOut(new PrintStream(bo));
//            vraag.setType();
//
//            //Act
//            when()
//
//            //Assert
//            assertEquals("Openvragen",vraag.getType());
//        }
//    }
}


