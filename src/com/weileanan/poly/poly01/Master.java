package com.weileanan.poly.poly01;

public class Master {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Master(String name) {
        this.name = name;
    }
//利用多态机制
    public void feed(Animal animal,Food food){
        System.out.println("主人"+this.name+animal.getName()+"喂"+food.getName());
    }

    public void feed(Dog dog,Bone bone){
        System.out.println("主人"+this.name+"给Dog"+dog.getName()+"喂"+bone.getName());
    }
}
