package State;


//объект должен менять своё поведение в зависимости от своего состояния.

public class StateA implements State{
    @Override
    public void doAction(Context context) {
        context.setValue(context.getValue()+1);
    }
}
