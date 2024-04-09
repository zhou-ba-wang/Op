package day7.Homework;

import java.nio.channels.Pipe;

public class H05 {
    public static void main(String[] args) {
        Circle c = new Circle(23);
        System.out.println("周长:" + c.c(c));
        System.out.println("面积:" + c.s(c));
    }
}
class Circle{
    double r ;
    Circle(double r){
        this.r = r;
    }
    public double c(Circle c){
        return Math.PI * 2 * c.r;
    }
    public double s(Circle c){
        return Math.PI * c.r * c.r;
    }
}
