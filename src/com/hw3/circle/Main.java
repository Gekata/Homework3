package main;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Circle circle1 = new Circle(0.32);
        System.out.println(circle.calculateArea());
        System.out.println(circle1.calculateArea());
        System.out.println(Circle.getCount());
    }
}