package Factory;

public class PayPal implements PaymentSystem{

    @Override
    public void pay() {
        System.out.println("PayPal");
    }
}
