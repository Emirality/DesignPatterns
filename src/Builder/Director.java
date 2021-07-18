package Builder;

public class Director {
    private ComputerBuilder computerBuilder;

    public void setComputerBuilder(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }

    public Computer getComputer(){
        return computerBuilder.getComputer();
    }
    public void ConstructComputer(){
        computerBuilder.createNewComputer();
        computerBuilder.setCpu();
        computerBuilder.setGpu();
        computerBuilder.setMotherboard();
        computerBuilder.setSsd();
    }
}
