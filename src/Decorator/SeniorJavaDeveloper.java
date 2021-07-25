package Decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }
    @Override
    public void doWork() {
        developer.doWork();
        System.out.println("Review code");
    }
}
