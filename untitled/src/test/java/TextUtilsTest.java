import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.lang.model.element.NestingKind;

public class TextUtilsTest {
    @Test
    public void getWordInCapitalLettersTest() {
        //give
        String givenWord = "Ana";
        String expectedResult = "ANA";

        //when
        String actualResult = TextUtils.getWordInCapitalLetters(givenWord);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void getWordInCapitalLettersWithNullTest() {
        //given
        String givenWord = null;
        String expectedResult = null;

        //when
        String actualResult = TextUtils.getWordInCapitalLetters(givenWord);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertNull(actualResult);
    }

    @Test
    public void convertToDoubleTest() {
        //given
        String givenNumber = "1250";
        Double expectedResult = 1250d;

        //when
        Double actualResult = TextUtils.convertToDouble(givenNumber);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void convertToDoubleNullTest() {
        //given
        String givenWord = null;
        String expectedResult = null;

        //when
        Double actualResult = TextUtils.convertToDouble(givenWord);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertNull(actualResult);
    }

    @Test
    public void isNullOrBlankTest() {
        //given
        String givenWord = "";
        boolean expectedResult = true;

        //when
        boolean actualResult = TextUtils.isNullOrBlank(givenWord);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertTrue(actualResult);

    }

    @Test
    public void isNullOrBlankWithEmptyStringTest() {
        //given
        String givenWord = "     ";
        boolean expectedResult = true;

        //when
        boolean actualResult = TextUtils.isNullOrBlank(givenWord);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertTrue(actualResult);

    }

    @Test
    public void isNullOrBlankWithNullStringTest() {
        //given
        String givenWord = null;
        boolean expectedResult = true;

        //when
        boolean actualResult = TextUtils.isNullOrBlank(givenWord);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertTrue(actualResult);

    }

    @Test
    public void isNullOrBlankWithTextStringTest() {
        //given
        String givenWord = "Maria";
        boolean expectedResult = false;

        //when
        boolean actualResult = TextUtils.isNullOrBlank(givenWord);

        //then
        Assertions.assertEquals(expectedResult, actualResult);
        Assertions.assertFalse(actualResult);
    }

    @Test
    public void getDefaultIfNullTest() {
        //given
        String myWord = "Romania";
        String expectedResult = myWord;
        String defaultWord = null;

        //when
        String actualRestul = TextUtils.getDefaultIfNull(myWord, defaultWord);

        //then
        Assertions.assertEquals(expectedResult, actualRestul);

    }

    @Test
    public void getDefaultIfNullWithNullTest() {
        //given
        String myWord = null;
        String defaultWord = "Default Word";
        String expectedResult = defaultWord;

        //when
        String actualRestul = TextUtils.getDefaultIfNull(myWord, defaultWord);

        //then
        Assertions.assertEquals(expectedResult, actualRestul);
    }

    @Test
    public void concatWithNullArrayTest() {
        //given
        String[] givenArray = null;
        String expectedStringResult = null;

        //when
        String actualStringResult = TextUtils.concat(givenArray);

        //then
        Assertions.assertEquals(expectedStringResult, actualStringResult);
        Assertions.assertNull(actualStringResult);
    }

    @Test
    public void concatWithEmptyArrayTest() {
        //given
        String[] givenArray = {}; // {} inseamna ca nu este null dar nu avem niciun element
        String expectedStringResult = null;

        //when
        String actualStringResult = TextUtils.concat(givenArray);

        //then
        Assertions.assertEquals(expectedStringResult, actualStringResult);
        Assertions.assertNull(actualStringResult);
    }

    @Test
    public void concatWithWordsArrayTest() {
        //given
        String[] givenArray = {"Ana", " ", "are", " ", "mere"};
        String expectedStringResult = "Ana are mere";

        //when
        String actualStringResult = TextUtils.concat(givenArray);

        //then
        Assertions.assertEquals(expectedStringResult, actualStringResult);
        Assertions.assertNotNull(actualStringResult);
    }
    @Test
    public void concatWithWordsArrayAndNullValueTest() {
        //given
        String[] givenArray = {"Ana",null, " ", "are", null, " ", "mere"};
        String expectedStringResult = "Ana are mere";

        //when
        String actualStringResult = TextUtils.concat(givenArray);

        //then
        Assertions.assertEquals(expectedStringResult, actualStringResult);
        Assertions.assertNotNull(actualStringResult);
    }
}