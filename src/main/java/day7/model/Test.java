package day7.model;

public class Test {
    public static void main(String[] args) {
        for(HandValues hv : HandValues.values()) {
            System.out.println(hv + " " + hv.value);
        }
        for(CardValues cv : CardValues.values()) {
            System.out.println(cv + " " + cv.value);
        }
    }
}
