package com.weileanan.extend_;

public class Test {
    public static void main(String[] args) {
        NotePad notePad = new NotePad();
        PC pc = new PC();
        notePad.color = "Green";
        notePad.cpu = "Intel";
        notePad.harddisk = "128G";
        notePad.memory = "8G";
        pc.brand = "Apple";
        pc.cpu = "Intel";
        pc.harddisk = "256G";
        pc.memory = "8G";

        System.out.println(notePad.getDetails() + notePad.getColor());
        System.out.println(pc.getDetails() + pc.getBrand());
    }
}
