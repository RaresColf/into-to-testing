import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyFirstAssertJClassTest {
    @Test
    public void addWithAssertJTest(){
        //given
        Calculator calculator = new Calculator();
        Double expectedResult = 9d;
        //when

        Double actualResult = calculator.add(4,5);

        //then
        Assertions.assertThat(actualResult).isEqualTo(expectedResult).isBetween(2d,20d).isGreaterThan(5d)
                .isLessThan(100d).isNotZero().isNotNegative().isPositive();

 // cu ajutorul librariei assertJ putem sa testam mult mai usor si mai structurat mult mai multe scenarii. Se foloseste doar in partea de //Than.
    }

    @Test

    public void stringAssertJTest(){
        String programmingLanguage = "Java";
        //

        Assertions.assertThat(programmingLanguage).isEqualTo("Java").isNotEqualTo("php").hasSizeLessThan(5).isNotEmpty().isNotBlank().isIn("js","php","Java");

    }
}
