package day2;

import day2.utils.GameDataParser;
import day2.utils.MinCubePowSum;
import day2.utils.PossibleGamesFinder;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class day2 {

    public static void main(String[] args) {
        List<String> inputData = new ArrayList<>();
        try {
            inputData = Files.readAllLines(Paths.get("src/main/java/day2/sources/input.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<CubeGame> games = new ArrayList<>();
        for (String data : inputData) {
            games.add(GameDataParser.parseGameData(data));
        }

        int total = MinCubePowSum.findMinCubePowerSum(games);
        System.out.println(total);
    }
}
