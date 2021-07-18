package Builder.hardware;

public class Ssd {
    private String name;
    private int capacity;

    public Ssd(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Ssd{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
