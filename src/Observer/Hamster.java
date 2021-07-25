package Observer;

public class Hamster implements Observer{

    public int balance;

    Hamster(int balance){
        this.balance = balance;
    }

    @Override
    public void Action(boolean sellOrNot) {
        this.balance = sellOrNot ? 0 : this.balance+20;
    }

}
