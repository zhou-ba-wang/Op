package day10.com.hspedu.encap;
//要求,
public class Encapsulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("小明你是个几把");
        person.setAge(30);
        person.setSal(30000);
        System.out.println(person.info());
        System.out.println(person.getSal());
        Person person1 = new Person("smice",300,50000);
        System.out.println( person1.info());

    }
}
//根据要求完善代码
//name 的长度 2-6 字符
class Person{
    public String name;
    private int age;
    private double sal;

    public Person() {

    }
    public Person(String name, int age, double sal) {
        //有三个参数的构造器
//        this.name = name;
//        this.age = age;
//        this.sal = sal;
        //set方法写在这里
        setName(name);
        setAge(age);
        setSal(sal);

    }
    public void setName(String name) {
        if(name.length() >= 2 && name.length() <= 6)
            this.name = name;
        else{
            System.out.println("输入姓名长度不合法,默认输入李华");
            this.name = "李华";
        }
    }

    public String getName() {
        return name;
    }


    //自己写太慢,我们可以使用快捷键 Alt + Insert
    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        if(age >= 1 && age <= 120)
        this.age = age;else{
            System.out.println("年龄输入不合法,默认输入18");
            this.age = 18;
        }
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    public String info(){
        return "个人信息如下" +  " name = " + this.name + " age = " + this.age
                + " sal = " + this.sal ;
    }
}

