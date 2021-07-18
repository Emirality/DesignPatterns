package Factory;

import javax.xml.bind.SchemaOutputResolver;

public class Qiwi implements PaymentSystem{
    @Override
    public void pay() {
        System.out.println("qiwi");
    }
}
