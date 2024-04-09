package day6;
//This的引出
public class This {
    public static void main(String[] args) {
       Dog g =new Dog("小花",3);
       g.info();
    }
}
class Dog{
    public String name;
    public int age;
    //构造器的形参如果是name , age成员变量就好了
    //如果没有this,那么成员变量并不能赋值
    public Dog(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void info(){
        System.out.println(name + '\t' + age + '\t');
    }
}