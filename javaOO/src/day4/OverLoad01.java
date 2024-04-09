package day4;

import java.net.SocketTimeoutException;

public class OverLoad01 {
    public static void main(String[] args) {
    MyCalculator mc = new MyCalculator();
    double result = 0.0;
    result = mc.calculate(2,13,6);
        System.out.println(result);
        result = mc.calculate(2,6);
        System.out.println(result);
        result = mc.calculate(2.6,6);
        System.out.println(result);
        result = mc.calculate(3,6.6);
        System.out.println(result);
        result = mc.calculate(2.5,6.6);
        System.out.println(result);

    }
}
class MyCalculator{
    //下面的4个calculate构成重载
    public int calculate(int n1,int n2){
        return n1+n2;
    }//方法的重载有不一样的就可以
    public double calculate(int n1,double n2){
        return n1+n2;
    }
    public double calculate(double n1,double n2){
        return n1+n2;
    }
    public double calculate(double n1,int n2){
        return n1+n2;
    }
    public int calculate(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
}


