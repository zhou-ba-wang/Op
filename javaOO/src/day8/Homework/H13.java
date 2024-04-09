package day8.Homework;

public class H13 {
    public static void main(String[] args) {
        PassObject p = new PassObject();
       // Circle c = new Circle();
        p.printAreas(new Circle(),5);
    }
}
class Circle{
    double radius;
//    Circle(double radius){
//        this.radius  = radius;
//    }
    public double findArea(double radius){
        return Math.PI * radius * radius;
    }
}
class PassObject {
    public void printAreas(Circle c, int times) {
        for (int i = 1; i <= times; i++) {
            System.out.println("半径:" + i + "面积" + c.findArea(i));
        }

    }
}
