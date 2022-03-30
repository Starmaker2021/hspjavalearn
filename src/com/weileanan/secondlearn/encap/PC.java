package com.weileanan.secondlearn.encap;

public class PC extends Computer {
    private String brand;

    public PC(String CPU, String memory, String hardDisk, String brand) {
        super(CPU, memory, hardDisk);
        this.setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDetails() {
        String details = this.getCPU() + " " + this.getMemory() + " " + this.getHardDisk() + this.getBrand();
        return details;
    }


}
