package Factory;

public class PaymentFactory {
    public PaymentSystem getPaymentSystem(String paymentName){
        if (paymentName.equalsIgnoreCase("yandex")){
            return new YandexPayment();
        }else if (paymentName.equalsIgnoreCase("paypal")){
            return new PayPal();
        }else if (paymentName.equalsIgnoreCase("qiwi")){
            return new Qiwi();
        }
        return null;
    }
}
