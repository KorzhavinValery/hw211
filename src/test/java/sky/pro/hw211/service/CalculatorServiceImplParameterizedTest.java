package sky.pro.hw211.service;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import sky.pro.hw211.service.impl.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static sky.pro.hw211.constants.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParameterizedTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("setOfValues")
    public void calculatePlus(int num1, int num2) {
        int result = out.plusCalculator(num1, num2);
        assertEquals(num1 + num2, result);
    }

    @ParameterizedTest
    @MethodSource("setOfValues")
    public void calculateMinus(int num1, int num2) {
        int result = out.minusCalculator(num1, num2);
        assertEquals(num1 - num2, result);
    }

    @ParameterizedTest
    @MethodSource("setOfValues")
    public void calculateMultiply(int num1, int num2) {
        int result = out.multiplyCalculator(num1, num2);
        assertEquals(num1 * num2, result);
    }

    @ParameterizedTest
    @MethodSource("setOfValues")
    public void calculateDivide(int num1, int num2) {
        int result = out.divideCalculator(num1, num2);
        assertEquals(num1 / num2, result);
    }

    private static Stream<Arguments> setOfValues() {
        return Stream.of(Arguments.of(DEFAULT_VALUE, DEFAULT_VALUE),
                Arguments.of(DEFAULT_VALUE, NEGATIVE_VALUE),
                Arguments.of(NEGATIVE_VALUE, DEFAULT_VALUE));
    }
}
