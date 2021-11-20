package com.weileanan.extend_;

public class Computer {
    public String cpu;
    public String memory;
    public String harddisk;

    public String getDetails() {
        return this.cpu + this.memory + this.harddisk;
    }
}
