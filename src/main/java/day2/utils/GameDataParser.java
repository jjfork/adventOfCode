package day2.utils;

import day2.CubeGame;

public class GameDataParser {
    public static CubeGame parseGameData(String data) {
        String[] parts = data.split(":");
        int id = Integer.parseInt(parts[0].substring(5));
        CubeGame game = new CubeGame(id);

        String[] turns = parts[1].split(";");
        for (String turn : turns) {
            String[] cubes = turn.split(",");
            for (String cube : cubes) {
                String[] cubeData = cube.trim().split(" ");
                int count = Integer.parseInt(cubeData[0]);
                String color = cubeData[1];

                switch (color) {
                    case "red" -> game.setMaxRed(Math.max(game.getMaxRed(), count));
                    case "green" -> game.setMaxGreen(Math.max(game.getMaxGreen(), count));
                    case "blue" -> game.setMaxBlue(Math.max(game.getMaxBlue(), count));
                }
            }
        }
        return game;
    }
}
