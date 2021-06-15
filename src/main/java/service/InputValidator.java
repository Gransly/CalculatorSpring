package service;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class InputValidator {

    public int Input()
    {
        BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));
        int number = -1;
        while(number < 0){
            try {
                System.out.println("Input integer:");
                number = Integer.parseInt(reader.readLine());
            } catch (Exception e) {
                System.out.println("Error input");
            }
        }
        return number;
    }

}
