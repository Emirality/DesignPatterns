package Decorator;

public class Main {
    public static void main(String[] args) {
        Developer developer = new DeveloperDecorator(new TeamLead(new SeniorJavaDeveloper(new JavaDeveloper())));
        developer.doWork();
    }
}
