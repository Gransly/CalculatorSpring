package service;

public  class ConverterIntToArray {
    public static int[] convertInt2Array(int number)
    {
        return Integer.toString(number).chars().map(c -> c - '0').toArray();
    }
}