package day5;

public class ConstructorExersice {
    public static void main(String[] args) {
        Person3 p3 = new Person3();
        System.out.println(p3.age);
        Person3 p4 = new Person3("张三",18);
        System.out.println(p4.age + " " + p4.name);

    }
}
class Person3{
    int age  ;
    String name;
    public Person3(){
        age = 18;
    }
    public Person3(String pName, int pAge){
        name = pName;
        age = pAge;

    }
}
