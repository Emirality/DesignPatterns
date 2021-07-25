package State;

public class StateA implements State{
    @Override
    public void doAction(Context context) {
        context.setValue(context.getValue()+1);
    }
}
