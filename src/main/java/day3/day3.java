package day3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class day3 {
    private static final int[][] DIRECTIONS = new int[][]{{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1}, {1, -1}, {-1, 1}};

    private static char[][] readFile(String filePath) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        List<String> list = br.lines().collect(Collectors.toList());
        char[][] engine = new char[list.size()][];
        IntStream.range(0, list.size()).forEach(i -> engine[i] = list.get(i).toCharArray());
        return engine;
    }
    private static long calculateSum(char[][] engine) {
        long sum = 0;
        for (int i = 0; i < engine.length; i++) {
            int num = 0;
            boolean isNum = false;
            for (int j = 0; j < engine[i].length; j++) {
                int tmp = extractDigit(engine[i][j]);
                if (tmp == -1) {
                    if (isNum) {
                        sum += num;
                        isNum = false;
                    }
                    num = 0;
                } else {
                    num = num * 10 + tmp;
                    for (int[] dir : DIRECTIONS) {
                        if (i + dir[0] >= 0 && i + dir[0] < engine.length && j + dir[1] >= 0 && j + dir[1] < engine[i + dir[0]].length) {
                            if (engine[i + dir[0]][j + dir[1]] != '.' && extractDigit(engine[i + dir[0]][j + dir[1]]) == -1)
                                isNum = true;
                        }
                    }
                }
            }
            if (isNum) {
                sum += num;
            }
        }
        return sum;
    }

    private static int extractDigit(char c) {
        if (c >= '0' && c <= '9') return c - '0';
        return -1;
    }



    public static void main(String[] args) throws IOException {
        char[][] ans = readFile("src/main/java/day3/sources/input.txt");
        System.out.println(calculateSum(ans));

    }
}