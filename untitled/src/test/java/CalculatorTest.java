import org.junit.jupiter.api.*;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalculatorTest {

    Calculator calculator;


    @BeforeEach
    public void setUp() {
        System.out.println(" This prints before each test ");
        calculator = new Calculator();
    }
    @AfterEach
    public void tearDown(){
        System.out.println(" This prints after each test ");
    }

    @BeforeAll
    public static void logTestStartingTime(){
        System.out.println("Started test at: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss")));  //regix se numeste formatul datei
    }

    @AfterAll
    public static void endTestStartingTime(){
        System.out.println("End test at: " + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd  HH:mm:ss")));  //regix se numeste formatul datei
    }



    @Test
    @Disabled // aceasta adnotare se folosete ca sa anulam un test
    public void addTest() {
        //given ( declaram datele de intrare)
//        Calculator calculator = new Calculator();  - aici am comentat constructorul pentru ca l-am declarat la inceput si am abnotat functia beforeEch
        double firstNumber = 4;
        double secondNumber = 10;
        Double expectedResult = 14d;


        //when (ne chemam metoda pe care o testam)
        Double actualResult = calculator.add(firstNumber, secondNumber);

        //then ( venim cu verificariile din JUnit)

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName(" This is an unit test for substractTest ")  // cu adnotarea asta se afiseaza numele dorit de noi in loc de numele metodei
    public void subtractTest() {
        //given
//        Calculator calculator = new Calculator();
        double firstNumber = 20;
        double secondNumber = 10;
        Double expectedResult = 10d;
        Double unexpectedResult = 50d;

        //when
        Double actualResult = calculator.substract(firstNumber, secondNumber);

        //then

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertNotEquals(unexpectedResult, actualResult);

    }

    @Test
    public void subtractWithNegativeValueTest() {
        //given
//        Calculator calculator = new Calculator();
        double firstNumber = 20;
        double secondNumber = -10;
        Double expectedResult = null;

        //when
        Double actualResult = calculator.substract(firstNumber, secondNumber);

        //then

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertNull(actualResult);

    }

    @Test
    public void multiplyTest() {
        //given
//        Calculator calculator = new Calculator();
        double firstNumber = 5;
        double secondNumber = 20;
        Double expectedResult = 100d;
        Double unexpectedResult = 40d;

        //when
        Double actualResult = calculator.multiply(firstNumber, secondNumber);

        //then

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertNotEquals(unexpectedResult, actualResult);
    }

    @Test
    public void divide() {
        //given
//        Calculator calculator = new Calculator();
        double firstNumber = 70;
        double secondNumber = 2;
        Double expectedResult = 35d;

        //when
        Double actualResult = calculator.divide(firstNumber, secondNumber);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void divideWithZeroTest() {
        //given
//        Calculator calculator = new Calculator();
        double firstNumber = 10;
        double secondNumber = 0;
        Double expectedResult = null;

        //when
        Double actualResult = calculator.divide(firstNumber, secondNumber);

        //then

        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertNull(actualResult);

    }

    @Test
    public void reverseSign() {
        //given
//        Calculator calculator = new Calculator();
        int number = 1;
        Integer expectedResult = -1;

        //when
        Integer actualResult = calculator.reverseSign(number);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void reverseSignZeroTest() {
        //given
//        Calculator calculator = new Calculator();
        int number = 0;
        Integer expectedResult = null;

        //when
        Integer actualResult = calculator.reverseSign(number);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertNull(actualResult);
    }
}