package Prototype;

public class Programmer extends Employee{

    Programmer(int id, String name){
        super(id, name);
    }

    @Override
    public Employee copy() {
        return new Programmer(this.getId(),this.getName());
    }
}
