package day16.com.hspedu.poly_.polyarr_;

import javax.jnlp.PersistenceService;

public class PolyArray {
    public static void main(String[] args) {
        //要求创建一个Person对象,两个Student对象和两
        // 个Teacher对象,统一放在一个数组里,并调用每个对象的say方法
        //如何调用子类的特有方法
          Person[] persons = new Person[5];
//        Person person1 = new Person("李一", 1);
//        Student student1 = new Student("王二", 2, 66.6F);
//        Student student2 = new Student("张三", 3, 55.5F);
//        Teacher teacher1 = new Teacher("刘四", 4, 3000.9);
//        Teacher teacher2 = new Teacher("周五", 5, 4000.9);
//        persons[0] = person1;
//        persons[1] = student1;
//        persons[2] = student2;
//        persons[3] = teacher1;
//        persons[4] = teacher2;d
        persons[0] = new Person("joker" , 18);
        persons[1] = new Student("joker1" , 18,66.6F);
        persons[2] = new Student("joker2" , 18, 66.5F);
        persons[3] = new Teacher("joker3" , 18, 30000);
        persons[4] = new Teacher("joker4" , 18, 20000);

        for (int i = 0; i < persons.length ; i++) {
            //类型判断 + 向下转型
            System.out.println(persons[i].say());
            if(persons[i] instanceof Student){
                 ((Student) persons[i]).study();
            }
            if(persons[i] instanceof  Teacher){
                ((Teacher)persons[i]).teach();
            }
        }

    }
}

class Person {
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;

    public String say() {
        return "姓名 " + name + "年龄 " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

class Student extends Person {
    public Student(String name, int age, float score) {
        super(name, age);
        this.score = score;
    }

    private float score;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

//    public String say() {
//        return "姓名 " + getName() + " 年龄 " + getAge() + " 分数 " + score ;
//    }
public String say() {
    return "学生 " + super.say() + "分数 " + score ;
}
public  void study(){
    System.out.println("学习");
}
}

class Teacher extends Person {
    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    private double salary;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

//    public String say() {
//        return "姓名 " + getName() + "年龄 " + getAge() + "薪水 " + salary ;
//    }
    //简化版
public String say() {
    return "老师 + " + super.say() + "薪水 " + salary ;
}
    public void teach(){
        System.out.println("教书");
    }
}