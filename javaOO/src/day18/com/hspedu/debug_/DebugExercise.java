package day18.com.hspedu.debug_;

import sun.applet.Main;

public class DebugExercise {
    public static void main(String[] args) {
        //创建对象的流程
        //（1）加载Person类信息
        //（2）初始化 2.1默认初始化 2.2显示初始化 2.3构造器初始化
        //（3） 返回对象的地址
        Person person = new Person("小周",18);
        System.out.println(person);
    }
}
class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
