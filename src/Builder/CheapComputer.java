package Builder;

import Builder.hardware.Cpu;
import Builder.hardware.Gpu;
import Builder.hardware.Motherboard;
import Builder.hardware.Ssd;

public class CheapComputer extends ComputerBuilder{
    @Override
    public void setCpu() {
        computer.setCpu(new Cpu(3.2,2,4));
    }

    @Override
    public void setGpu() {
        computer.setGpu(new Gpu("gtx",2000));
    }

    @Override
    public void setMotherboard() {
        computer.setMotherboard(new Motherboard("v1"));
    }

    @Override
    public void setSsd() {
        computer.setSsd(new Ssd("chp",240));
    }
}
