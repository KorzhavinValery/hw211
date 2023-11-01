package sky.pro.hw211.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import sky.pro.hw211.service.impl.CalculatorServiceImpl;

import static sky.pro.hw211.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @Test
    public void calculatePlusTest() {
        int result = out.plusCalculator(DEFAULT_VALUE, DEFAULT_VALUE);
        Assertions.assertEquals(10, result);
    }

    @Test
    public void calculateMinusTest() {
        int result = out.minusCalculator(DEFAULT_VALUE, DEFAULT_VALUE);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void shouldReturnNegativeValue() {
        int result = out.plusCalculator(DEFAULT_VALUE, NEGATIVE_VALUE);
        Assertions.assertEquals(-5, result);
    }

    @Test
    public void calculateMultiplyTest() {
        int result = out.multiplyCalculator(DEFAULT_VALUE, DEFAULT_VALUE);
        Assertions.assertEquals(25, result);
    }

    @Test
    public void shouldReturnZeroWhenMultiplyZeroValue() {
        int result = out.multiplyCalculator(DEFAULT_VALUE, ZERO_VALUE);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void calculateDivideTest() {
        int result = out.divideCalculator(DEFAULT_VALUE, DEFAULT_VALUE);
        Assertions.assertEquals(1, result);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenDivideValueContainsZero() {

        Assertions.assertThrows
                (ArithmeticException.class,
                        () -> out.divideCalculator(DEFAULT_VALUE, ZERO_VALUE));
    }

}
