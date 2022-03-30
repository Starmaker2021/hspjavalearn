package com.weileanan.secondlearn.encap;

public class Computer {
    private String CPU;
    private String memory;
    private String hardDisk;

    public Computer(String CPU, String memory, String hardDisk) {
        this.setCPU(CPU);
        this.setMemory(memory);
        this.setHardDisk(hardDisk);
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
    }

    public String getDetails(){
        String details = this.getCPU()+" "+this.getMemory()+" "+this.getHardDisk();
        return details;
    }
    public void printInfo(){
        System.out.println(this.getDetails());
    }
}
