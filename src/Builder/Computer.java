package Builder;

import Builder.hardware.Cpu;
import Builder.hardware.Gpu;
import Builder.hardware.Motherboard;
import Builder.hardware.Ssd;

public class Computer {
    private Cpu cpu;
    private Gpu gpu;
    private Motherboard motherboard;
    private Ssd ssd;

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Ssd getSsd() {
        return ssd;
    }

    public void setSsd(Ssd ssd) {
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu=" + cpu +
                ", gpu=" + gpu +
                ", motherboard=" + motherboard +
                ", ssd=" + ssd +
                '}';
    }
}
