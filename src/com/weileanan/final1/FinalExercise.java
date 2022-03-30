package com.weileanan.final1;

public class FinalExercise {
    public static void main(String[] args) {
        Circle circle = new Circle(3.6);
        System.out.println(circle.calculateArea());

    }
}
class Circle{
    private double radius;
    private final double PI;

    public Circle(double radius) {
        this.radius = radius;
    }{
        PI = 3.14;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea(){
        double area = PI*this.radius*this.radius;
        return area;
    }
};