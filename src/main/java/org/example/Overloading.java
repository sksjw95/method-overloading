package org.example;

public class Overloading {
    public static void main(String[] args) {

        Shape s = new Shape();
        s.area();
        s.area(5);
        s.area(10,10);
        s.area(6.0,12.0);
    }
}