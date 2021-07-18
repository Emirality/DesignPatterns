package Factory;

public class Main {
    public static void main(String[] args) {
        PaymentFactory factory = new PaymentFactory();
        PaymentSystem paymentSystem = factory.getPaymentSystem("yandex");

        paymentSystem.pay();
    }
}
