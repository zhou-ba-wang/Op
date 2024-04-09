package day1;

public class Object02 {
    public static void main(String[] args) {
        //p1其实是一个对象名(引用对象,相当于c语言中的指针), new Person()才是真正的对象
        Person p1 = new Person("zwy",20,8000.4,true);
        //对象属性默认值,遵守数组的规则
        System.out.println("当前这个人的信息");
        System.out.println("name :" + p1.name + " age:" + p1.age + " sal:" + p1.sal + " whetherpass" + p1.whetherpass  );
    }
}
class Person{
    String name;
    int age;
    double sal;
    boolean whetherpass;
    Person(String name, int age, double sal, boolean whetherpass){
        this.name = name;
        this.age = age;
        this.sal = sal;
        this.whetherpass = whetherpass;
    }
}
