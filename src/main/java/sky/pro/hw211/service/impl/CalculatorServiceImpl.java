package sky.pro.hw211.service.impl;

import org.springframework.stereotype.Service;
import sky.pro.hw211.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private int sum;

    @Override
    public int plusCalculator(int num1, int num2) {
        sum = num1 + num2;
        return sum;
    }

    @Override
    public int minusCalculator(int num1, int num2) {
        sum = num1 - num2;
        return sum;
    }

    @Override
    public int multiplyCalculator(int num1, int num2) {
        sum = num1 * num2;
        return sum;
    }

    @Override
    public int divideCalculator(Integer num1, Integer num2) {
        if (num1 == 0 && num2 == 0) {
            throw new ArithmeticException("На 0 делить нельзя!");
        }
        sum = num1 / num2;
        return sum;
    }

}
