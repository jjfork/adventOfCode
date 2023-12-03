package day2;


public class CubeGame {
    private final int id;
    private int maxRed = 0;
    private int maxGreen = 0;
    private int maxBlue = 0;

    public CubeGame(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public int getMaxRed() {
        return maxRed;
    }

    public void setMaxRed(int maxRed) {
        this.maxRed = maxRed;
    }

    public int getMaxGreen() {
        return maxGreen;
    }

    public void setMaxGreen(int maxGreen) {
        this.maxGreen = maxGreen;
    }

    public int getMaxBlue() {
        return maxBlue;
    }

    public void setMaxBlue(int maxBlue) {
        this.maxBlue = maxBlue;
    }
}
