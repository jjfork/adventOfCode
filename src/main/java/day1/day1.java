package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class day1 {

    static List <Integer> listOfNumbers = new ArrayList<>();
    public static void main(String[] args) {
        readIntsFromTxt();
        Integer sum = listOfNumbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }

    public static int wrapNumbers(String line) {
        line = line.replaceAll("[^0-9]", "");
        int numbers = Integer.parseInt(line);
        numbers = numberFromLine(numbers);
        return numbers;
    }

    public static int numberFromLine(int number){
        List <Integer> numbersInLine = new ArrayList<>();
        numbersInLine.add(firstDigit(number));
        numbersInLine.add(lastDigit(number));
        int total = 0;
        for (Integer i : numbersInLine) {
            total = 10*total+i;
        }
        return total;
    }

    public static int lastDigit(int number) {
        return (number % 10);
    }

    public static int firstDigit(int number) {
        while (number >= 10) {
            number /= 10;
        } return number;
    }
    public static void readIntsFromTxt() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/day1/sources/input.txt"));
            String line = reader.readLine();
            while (line != null) {
                int numbersInLine = wrapNumbers(line);
                listOfNumbers.add(numbersInLine);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
