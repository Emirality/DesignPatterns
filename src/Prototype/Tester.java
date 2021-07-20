package Prototype;

public class Tester extends Employee{

    Tester(int id, String name){
        super(id,name);
    }

    @Override
    public Employee copy() {
        return new Tester(this.getId(),this.getName());
    }
}
