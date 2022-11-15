import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstJunitClassTest {
    //1. toate testele unitare trebuie sa fie publice
    //2. testele unitare nu returneaza nimic
    //3. testele unitare nu primesc parametrii
    //4. testele unitare trebuie sa fie adnotate cu @test

    @Test
    public void myFirstJunitTest (){
        System.out.println("this runs from my first unit test");

    }
    @Test
    public void compareTwoStringsTest(){
        String firstWord = "Java";
        String secondWord = "Java";

        Assertions.assertEquals(firstWord,secondWord);
        Assertions.assertNotEquals(firstWord, "php");
    }
    @Test
    public void compareTwoBooleansTest(){
        boolean isBlack = true;
        boolean isWhite = false;

        Assertions.assertTrue(isBlack);
        Assertions.assertFalse(isWhite);

    }
    @Test
    public void checkObjectForNullTest(){
        String stringObject = "java";
        String nullObject = null;

        Assertions.assertNotNull(stringObject);
        Assertions.assertNull(nullObject);


    }

}
