package es.codeurjc.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorParserTest {

    private CalculatorParser calculator;

    @BeforeEach
    void init() {
        calculator = new CalculatorParser();
    }

    @Test
    void Test_Num_1() {
        // GIVEN
        String uno = "1";
        // WHEN
        int result = calculator.parse(uno);
        // THEN
        assertEquals(1, result);
    }

    @Test
    void Test_Num_2() {
        // GIVEN
        String dos = "2";
        // WHEN
        int result = calculator.parse(dos);
        // THEN
        assertEquals(2, result);
    }

    @Test
    void Test_Num_3() {
        // GIVEN
        String tres = "3";
        // WHEN
        int result = calculator.parse(tres);
        // THEN
        assertEquals(3, result);
    }

    @Test
    void Test_Num_4() {
        // GIVEN
        String expression = "1 + 1";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(2, result);
    }

    @Test
    void Test_Num_5() {
        // GIVEN
        String expression = "2 + 3";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(5, result);
    }

    @Test
    void Test_Num_6() {
        // GIVEN
        String expression = "2 + 3 + 4";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(9, result);
    }

    @Test
    void Test_Num_7() {
        // GIVEN
        String expression = "1 + 2 + 3 + 4";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(10, result);
    }

    @Test
    void Test_Num_8() {
        // GIVEN
        String expression = "A";

        // WHEN
        InvalidExpression excep = assertThrows(InvalidExpression.class, () -> calculator.parse(expression));

        // THEN
        assertEquals("Invalid Expression", excep.getMessage());
    }

    @Test
    void Test_Num_9() {
        // GIVEN
        String expression = "B";

        // WHEN
        InvalidExpression excep = assertThrows(InvalidExpression.class, () -> calculator.parse(expression));

        // THEN
        assertEquals("Invalid Expression", excep.getMessage());
    }

    @Test
    void Test_Num_10() {
        // GIVEN
        String expression = "k";

        // WHEN
        InvalidExpression excep = assertThrows(InvalidExpression.class, () -> calculator.parse(expression));

        // THEN
        assertEquals("Invalid Expression", excep.getMessage());
    }

    @Test
    void Test_Num_11() {
        // GIVEN
        String expression = "HoLa";

        // WHEN
        InvalidExpression excep = assertThrows(InvalidExpression.class, () -> calculator.parse(expression));

        // THEN
        assertEquals("Invalid Expression", excep.getMessage());
    }

    @Test
    void Test_Num_12() {
        // GIVEN
        String expression = "1 + A";

        // WHEN
        InvalidExpression excep = assertThrows(InvalidExpression.class, () -> calculator.parse(expression));

        // THEN
        assertEquals("Invalid Expression", excep.getMessage());
    }

    @Test
    void Test_Num_13() {
        // GIVEN
        String expression = "5 - 3";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(2, result);
    }

    @Test
    void Test_Num_14() {
        // GIVEN
        String expression = "1 - 2";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(-1, result);
    }

    @Test
    void Test_Num_15() {
        // GIVEN
        String expression = "7 - 2 - 1";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(4, result);
    }

    @Test
    void Test_Num_16() {
        // GIVEN
        String expression = "9 - 5 - 3 - 1";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(0, result);
    }

    @Test
    void Test_Num_17() {
        // GIVEN
        String expression = "7 + 1 - 5";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(3, result);
    }

    @Test
    void Test_Num_18() {
        // GIVEN
        String expression = "9 - 5 + 4";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(8, result);
    }

    @Test
    void Test_Num_19() {
        // GIVEN
        String expression = "9 + 1 - 6 - 2";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(2, result);
    }

    @Test
    void Test_Num_20() {
        // GIVEN
        String expression = "-5 + 9";

        // WHEN
        int result = calculator.parse(expression);

        // THEN
        assertEquals(4, result);
    }
}
