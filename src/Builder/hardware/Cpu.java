package Builder.hardware;

public class Cpu {
    private double frequency;
    private int cores;
    private int streams;
    public Cpu(double frequency, int cores, int streams){
        this.frequency = frequency;
        this.cores = cores;
        this.streams = streams;
    }
    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public int getStreams() {
        return streams;
    }

    public void setStreams(int streams) {
        this.streams = streams;
    }

}
