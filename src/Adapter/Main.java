package Adapter;

public class Main {
    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request("get html");
    }
}
