package day1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class day1 {

    static List <Long> listOfNumbers = new ArrayList<>();
    public static void main(String[] args) {
        readIntsFromTxt();
        Long sum = listOfNumbers.stream().mapToLong(Long::longValue).sum();
        System.out.println(sum);
    }

    public static long wrapNumbers(String line) {
        line = changeStringNumbersToInt(line);
        line = line.replaceAll("[^0-9]", "");
        long numbers = Integer.parseInt(line);
        numbers = numberFromLine(numbers);
        return numbers;
    }

    public static String changeStringNumbersToInt(String line) {
        String newString = line;
        if (line.contains("one")) {
            newString = newString.replaceAll("on", "1");
        }
        if (line.contains("two")) {
            newString = newString.replaceAll("tw", "2");
        }
        if (line.contains("three")) {
            newString = newString.replaceAll("thre", "3");
        }
        if (line.contains("four")) {
            newString = newString.replaceAll("fou", "4");
        }
        if (line.contains("five")) {
            newString = newString.replaceAll("fiv", "5");
        }
        if (line.contains("six")) {
            newString = newString.replaceAll("si", "6");
        }
        if (line.contains("seven")) {
            newString = newString.replaceAll("seve", "7");
        }
        if (line.contains("eight")) {
            newString = newString.replaceAll("eigh", "8");
        }
        if (line.contains("nine")) {
            newString = newString.replaceAll("nin", "9");
        }
        return newString;
    }


    public static long numberFromLine(long number){
        List <Long> numbersInLine = new ArrayList<>();
        numbersInLine.add(firstDigit(number));
        numbersInLine.add(lastDigit(number));
        long total = 0;
        for (Long i : numbersInLine) {
            total = 10*total+i;
        }
        return total;
    }

    public static long lastDigit(long number) {
        return (number % 10);
    }

    public static long firstDigit(long number) {
        while (number >= 10) {
            number /= 10;
        } return number;
    }
    public static void readIntsFromTxt() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("src/main/java/day1/sources/input.txt"));
            String line = reader.readLine();
            while (line != null) {
                long numbersInLine = wrapNumbers(line);
                listOfNumbers.add(numbersInLine);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
