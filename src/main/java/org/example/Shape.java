package org.example;

public class Shape {
    public void area(){
        System.out.println("넓이");
    }

    public void area(int r){
        System.out.println("원 넓이 = " + 3.14*r*r);
    }
    public void area(int w, int l){
        System.out.println("직사각형 넓이 = " + w * l);
    }

    public void area(double b, double h){
        System.out.println("삼각형 넓이 = " + 0.5 * b * h);
    }
}
