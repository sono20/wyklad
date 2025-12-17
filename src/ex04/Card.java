package ex04;

public enum Card {
    TWO(2), THREE(3), JACK(10), QUEEN(11), KING(13), ACE(14);

    private int value;
    Card(int value){
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}
