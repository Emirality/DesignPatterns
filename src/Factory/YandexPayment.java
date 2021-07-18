package Factory;

public class YandexPayment implements PaymentSystem{

    @Override
    public void pay() {
        System.out.println("yandex");
    }

}
