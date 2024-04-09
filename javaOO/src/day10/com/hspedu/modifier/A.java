package day10.com.hspedu.modifier;

import com.sun.javafx.collections.SourceAdapterChange;

public class A {
    //四个成员变量的不同修饰符
    public  int n1 = 100;
    protected  int n2 = 200;
    int n3 = 300;
    private int n4  = 400;
    public  void m1(){
        System.out.println("该方法可以访问4个`成员变量");
        System.out.println("n1" + this.n1 +"n2" + this.n2 + " n3" + this.n3 + "n4" + this.n4);

    }

    public static void main(String[] args) {
        A a = new A();
        a.m1();
    }

}
