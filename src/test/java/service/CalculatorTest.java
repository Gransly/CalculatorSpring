package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void sum() {
        //Arrange
        int[] numbers = new int[]{1,2,3};

        //Act
        Calculator calculator = new Calculator(numbers);
        int result = calculator.Sum();
        //Assert
        int expected = 6;
        assertEquals(expected,result);
    }

    @Test
    void max() {
        //Arrange
        int[] numbers = new int[]{1,2,3};

        //Act
        Calculator calculator = new Calculator(numbers);
        int result = calculator.Max();
        //Assert
        int expected = 3;
        assertEquals(expected,result);
    }

    @Test
    void min() {
        //Arrange
        int[] numbers = new int[]{1,2,3};

        //Act
        Calculator calculator = new Calculator(numbers);
        int result = calculator.Min();
        //Assert
        int expected = 1;
        assertEquals(expected,result);
    }

    @Test
    void avg() {
        //Arrange
        int[] numbers = new int[]{1,2,3};

        //Act
        Calculator calculator = new Calculator(numbers);
        double result = calculator.Avg();
        //Assert
        double expected = 2;
        assertEquals(expected,result);
    }
}