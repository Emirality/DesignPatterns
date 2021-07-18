package Builder.hardware;

public class Motherboard {
    private String name;

    public Motherboard(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Motherboard{" +
                "name='" + name + '\'' +
                '}';
    }
}
