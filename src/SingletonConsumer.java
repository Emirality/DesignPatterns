public class SingletonConsumer {
    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance("Light");
        Singleton s2 = Singleton.getInstance("Emy");

        System.out.println(s1.value);
        System.out.println(s2.value);
    }
}

class Singleton{
    private static Singleton instance;
    public String value;

    private Singleton(String value){
        this.value = value;
    }

    public static Singleton getInstance(String value){
        if (Singleton.instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}



