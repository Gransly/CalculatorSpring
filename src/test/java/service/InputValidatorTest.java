package service;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    @Test
    void input() {

        //Act


        InputStream sysInBackup = System.in; // backup System.in to restore it later
        ByteArrayInputStream in = new ByteArrayInputStream("123".getBytes());
        System.setIn(in);

        InputValidator validator = new InputValidator();
        int result = validator.Input();
        //Assert
        int expected = 123;
        assertEquals(expected,result);


        System.setIn(sysInBackup);
    }
}