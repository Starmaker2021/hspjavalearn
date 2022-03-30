package com.weileanan.secondlearn.encap;

public class Notepad extends Computer {
    private String color;

    public Notepad(String CPU, String memory, String hardDisk, String color) {
        super(CPU, memory, hardDisk);
        this.setColor(color);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDetails() {
        String details = this.getCPU() + " " + this.getMemory() + " " + this.getHardDisk() + "" + this.getColor();
        return (details);
    }
}
