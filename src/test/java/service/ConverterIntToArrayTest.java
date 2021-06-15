package service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterIntToArrayTest {

    @Test
    void convertInt2Array() {
        //Arrange
        int numbers = 123;

        //Act

        int[] result = ConverterIntToArray.convertInt2Array(numbers);
        //Assert
        int[] expected = new int[]{1,2,3};
        assertArrayEquals(expected,result);
    }
}