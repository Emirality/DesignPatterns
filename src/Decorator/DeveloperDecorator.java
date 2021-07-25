package Decorator;

public class DeveloperDecorator implements Developer{

    Developer developer;

    DeveloperDecorator(Developer developer){
        this.developer = developer;
    }
    @Override
    public void doWork() {
        developer.doWork();
    }
}
