package day8.Homework;

public class H12 {

}
class Employee{
    String name;
    char gender;
    int age;
    String office;
    double wage;
    Employee(String name , char gender , int age ,String office , double wage){
        this(name,gender,age);
        //this(office,wage);
        this.name = name;
        this.gender = gender ;
        this.age = age;
        this.office = office;
        this.wage = wage;
    }
    Employee(String name , char gender , int age){
        this.name = name;
        this.gender = gender ;
        this.age = age;
    }
    Employee(String office , double wage){
        this.office = office;
        this.wage = wage;
    }


}
