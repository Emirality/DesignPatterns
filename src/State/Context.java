package State;

public class Context {

    private int value;
    State state;

    Context(int value){
        this.value = value;
    }

    public void setState(State state) {
        this.state = state;
        doAction();
    }

    void doAction(){
        state.doAction(this);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
