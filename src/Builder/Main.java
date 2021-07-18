package Builder;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        director.setComputerBuilder(new CheapComputer());
        Computer computer = director.ConstructComputer();

        System.out.println(computer);
    }
}
