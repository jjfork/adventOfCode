package day2.utils;

import day2.CubeGame;

import java.util.List;

public class PossibleGamesFinder {

    public static int findPossibleGames(List<CubeGame> games) {
        int total = 0;

        for (CubeGame game : games) {
            if (game.getMaxRed() <= 12 && game.getMaxGreen() <= 13 && game.getMaxBlue() <= 14) {
                total += game.getId();
            }
        }
        return total;
    }
}
