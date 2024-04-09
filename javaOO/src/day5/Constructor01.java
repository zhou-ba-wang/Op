package day5;

public class Constructor01 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("史密斯",80);
    }
}
class Person1{
    String name;
    int age;
    //构造器
    //1.构造器没有返回值,也不能写void
    //2.构造器的名称和类名相同
    //3(String pName , int pAge)
    public Person1(String pName , int pAge){
        System.out.println("构造器被调用");
        name = pName;
        age = pAge;
    }

}
