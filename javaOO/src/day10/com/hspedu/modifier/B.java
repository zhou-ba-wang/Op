package day10.com.hspedu.modifier;

public class B {
    public  void say(){
        A a = new A();
        //在同一个包下可以访问public , protect , 默认,不能访问private
        System.out.println("n1" + a.n1 + "n2" + a.n2 + "n3" + a.n3 );//n4不可使用,因为private
    }
}
