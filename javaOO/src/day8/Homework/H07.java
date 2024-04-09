package day8.Homework;

public class H07 {
    public static void main(String[] args) {
        Dog  dog = new Dog("小花","花色",3);
        dog.show();

    }
}
class Dog{
    String name;
    String color;
    int age;
    public Dog(String name , String color , int age){
        this.name  = name;
        this.color = color;
        this.age = age;
    }
    public void show(){
        System.out.println("name:" + this.name + "color:" + this.color + "age:" + this.age );
    }


}
