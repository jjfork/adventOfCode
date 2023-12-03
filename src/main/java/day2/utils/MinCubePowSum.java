package day2.utils;

import day2.CubeGame;

import java.util.List;

public class MinCubePowSum {
    public static int findMinCubePowerSum(List<CubeGame> games) {
        int total = 0;

        for (CubeGame game : games) {
            total += game.getMaxRed() * game.getMaxGreen() * game.getMaxBlue();
        }
        return total;
    }
}
