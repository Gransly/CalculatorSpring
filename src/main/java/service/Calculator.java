package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    private List<Integer> numbers;
    public Calculator(int[] number){
        numbers = Arrays.stream(number).boxed().collect(Collectors.toList());
    }

    public int Sum()
    {
        int summarize = 0;
        for (Integer number : numbers) {
            summarize += number;
        }
        return  summarize;
    }

    public int Max(){
        int maxInt = 0;
        for (Integer number : numbers) {
            if (maxInt < number) {
                maxInt = number;
            }
        }
        return  maxInt;
    }

    public int Min(){
        int minInt = 10;
        for (Integer number : numbers) {
            if (minInt > number) {
                minInt = number;
            }
        }
        return minInt;
    }

    public float Avg(){
        return (float) Sum()/numbers.size();
    }
}
