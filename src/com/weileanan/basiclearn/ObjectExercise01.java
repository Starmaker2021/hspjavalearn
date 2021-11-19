package com.weileanan.basiclearn;

class Circle {
    double radius;

    //返回圆的面积
    public double findArea(double radius) {
        double area = radius * radius * Math.PI;
        return area;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}

class PassObject {
    //打印圆的面积
    public void printAreas(Circle c, int times) {
        System.out.println("radius     area");
        for (int i = 0; i < times; i++) {
            c.setRadius(i);
            System.out.print(i + "          " + c.findArea(i));
            System.out.println();
        }
    }
}

public class ObjectExercise01 {
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject p = new PassObject();
        p.printAreas(c, 5);
    }
}