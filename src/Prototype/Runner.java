package Prototype;

public class Runner {
    public static void main(String[] args) {
        Employee employee = new Programmer(1,"vasya");
        Employee employee1 = employee.copy();
        System.out.println(employee);
        System.out.println(employee1);
    }
}
