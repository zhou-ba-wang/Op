package day7;

public class TestPerson {
    public static void main(String[] args) {
   Person p1 = new Person("小明",19);
   Person p2 = new Person("小王",20);
        System.out.println(p1.compareTo(p2));
    }
}
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name = name;
        this.age = age;
    }
//    public  boolean compareTo(Person p1,Person p2){
//        if(p1.age == p2.age && (p1.name).equals(p2.name) && p1.hashCode() != p2.hashCode()){
//            return true;
//        }else{
//            return false;
//        }
//    }
    //使用this
    public  boolean compareTo(Person p2){
        if(this.age == p2.age && (this.name).equals(p2.name) && this.hashCode() != p2.hashCode()){
            return true;
        }else{
            return false;
        }
    }
}
