package day12.com.hspedu.extend02;

public class Son02 extends Father02{
    public Son02(String name, int age, char gender) {
        super(name, age, gender);//父类存在有参构造器时,子类必须构建对应的有参构造器,用super调用父类的构造器,并且放第一句
        System.out.println("Son02的Son02(String name, int age, char gender)构造器被调用");
    }
}
