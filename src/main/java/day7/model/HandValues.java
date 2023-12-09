package day7.model;

public enum HandValues {
    FIVEOFKIND(6),
    FOUROFKIND(5),
    FULLHOUSE(4),
    TWOPAIR(3),
    ONEPAIR(2),
    HIGHCARD(1);
    public int value;
    HandValues(int value) {
        this.value = value;
    }
}

