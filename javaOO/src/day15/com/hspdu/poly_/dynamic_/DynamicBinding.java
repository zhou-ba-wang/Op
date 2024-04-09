package day15.com.hspdu.poly_.dynamic_;

/**
 * 用来学习动态绑定机制
 */

public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();//向上转型
        System.out.println(a.sum());//40
        System.out.println(a.sum1());//30
    }
}
class A{//父类
    public int i = 10;
    public int sum(){
        return getI() + 10;
    }
    public int sum1(){
        return i + 10;//对应方法调用的属性,就近原则
    }
    public int getI(){
        return i;
    }
}
class B extends A{
    public int i = 20;
//    public int sum(){
//        return i + 20;
//    }
    public int getI(){
        return i;
    }
    public int sum1(){
        return i + 10;
    }
}