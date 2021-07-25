package State;

public class StateB implements State{
    @Override
    public void doAction(Context context) {
        context.setValue(context.getValue()-1);
    }
}
