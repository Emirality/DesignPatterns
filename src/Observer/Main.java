package Observer;

public class Main {
    public static void main(String[] args) {
        Hamster hamster = new Hamster(10);
        Whale whale = new Whale(1000);
        whale.addObserver(hamster);
        whale.setBalance(900);
        System.out.println(hamster.balance);
    }
}
