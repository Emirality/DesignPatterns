package State;

public class Main {
    public static void main(String[] args) {
        Context context = new Context(10);
        context.setState(new StateA());
        System.out.println(context.getValue());
        context.setState(new StateB());
        System.out.println(context.getValue());
    }
}
