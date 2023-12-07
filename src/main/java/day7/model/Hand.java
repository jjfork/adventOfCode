package day7.model;

public class Hand {
    private final int secondCard;
    private final int thirdCard;
    private final int fourthCard;
    private final int fifthCard;
    private final int bid;
    private int handValue = 0;
    private int rank = 0;

    public Hand(int firstCard, int secondCard, int thirdCard, int fourthCard, int fifthCard, int bid) {
        this.firstCard = firstCard;
        this.secondCard = secondCard;
        this.thirdCard = thirdCard;
        this.fourthCard = fourthCard;
        this.fifthCard = fifthCard;
        this.bid = bid;
    }
    private final int firstCard;


    public int getFirstCard() {
        return firstCard;
    }

    public int getSecondCard() {
        return secondCard;
    }

    public int getThirdCard() {
        return thirdCard;
    }

    public int getFourthCard() {
        return fourthCard;
    }

    public int getFifthCard() {
        return fifthCard;
    }

    public int getBid() {
        return bid;
    }

    public int getHandValue() {
        return handValue;
    }

    public void setHandValue(int handValue) {
        this.handValue = handValue;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

}
