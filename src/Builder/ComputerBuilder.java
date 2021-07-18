package Builder;

public abstract class ComputerBuilder {
    protected Computer computer;

    public Computer getComputer(){
        return computer;
    }

    public void createNewComputer(){
        computer = new Computer();
    }

    public abstract void setCpu();
    public abstract void setGpu();
    public abstract void setMotherboard();
    public abstract void setSsd();

}
