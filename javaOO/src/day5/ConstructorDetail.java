package day5;

import java.sql.SQLOutput;

public class ConstructorDetail {
    public static void main(String[] args) {
        //构造器的重载,构造器本质是一个方法
        //构造器与类名因相同
        //构造器没有返回值也不能放回void
        //构造器完成的是对象的初始化并不是创建对象
        //创建对象时系统自动调用该类的构造方法
        //当没有写构造器,系统自动写一个默认无参构造器如Dog(){ },可以对.class文件,javap反编译查看
        //一旦你编写了构造器,默认构造器就被你写的构造器所覆盖了
       Person2 p2 = new Person2("猪猪侠");
       Dog dog = new Dog();
    }
}
class Dog{

}
class Person2{
    int age ;
    String name;
    public Person2(int pAge , String pName){
        System.out.println("构造器1,被调用");
        age = pAge;
        name = pName;
    }
    public Person2(int pAge ){
        System.out.println("构造器2,被调用");
        age = pAge;
    }
    public Person2( String pName){
        System.out.println("构造器3,被调用");
        name = pName;
    }
}