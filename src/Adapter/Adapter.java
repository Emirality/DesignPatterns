package Adapter;

public class Adapter implements Target{

    private Adaptee adaptee;

    Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void request(String message) {
        this.adaptee.specificRequest(message);
    }
}
