package day8.Homework;

import java.lang.reflect.Method;

public class H11 {
    public double method(double n1,double n2){
        return n1 + n2;
    }
    public void test(){
        System.out.println(method(method(10.0,20.0),100));
    }
    public static void main(String[] args) {
       H11 h11 = new H11();
       h11.test();
    }
}
