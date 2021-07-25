package Decorator;

public class TeamLead extends DeveloperDecorator{
    TeamLead(Developer developer) {
        super(developer);
    }
    @Override
    public void doWork() {
        developer.doWork();
        System.out.println("send report for client");
    }
}
