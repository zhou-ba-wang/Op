package day5;

public class VarScopeDetail {
    public static void main(String[] args) {
        //1.当局部变量与属性重名,使用变量按就近原则
        //2.同一个作用域中不能重名
        //3.生命周期,属性的生命周期较长,与对象的生命周期同步,而局部变量的生命周期与方法一样,执行完后退栈销毁
        //4.作用于范围不同 全局变量不仅可以被本类使用,也可以通过对象调用 局部变量只能在本类对应方法中使用
        //5.修饰符不同 属性可以加修饰符 局部变量不可以加修饰符
    Person p = new Person();
    p.say();//当执行say方法后,say方法的局部变量name就销毁了,但时成员变量name还可以使用]
    }
}
class Person{
    String name = "jack";
    public void say(){
      //  String name = "jery";//作用域中已定义变量 'name'
        String name = "Tom";
        System.out.println("hi" + name);//就近原则

    }

}
