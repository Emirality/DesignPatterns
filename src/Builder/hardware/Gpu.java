package Builder.hardware;

public class Gpu {
    private String series;
    private int capacity;

    public Gpu(String series, int capacity){
        this.series = series;
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
