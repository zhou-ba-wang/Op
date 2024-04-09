package day3;

public class MethodExercise02 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 18;
        p.sal = 3000.0;
        MyTools mt = new MyTools();
        Person pCopy = mt.copyPerson(p);
        //测试
        //1,打印复制后对象
        //2.修改复制后的对象
        //3.打印对象
        System.out.println(pCopy.age + " " + pCopy.sal);
        pCopy.age = 20;
        System.out.println(p.age + " " + p.sal);
    }
}
class MyTools{
    public Person copyPerson(Person p1){
        Person p = new Person();
        p.sal = p1.sal;
        p.age = p1.age;
        return p;
    }

}

