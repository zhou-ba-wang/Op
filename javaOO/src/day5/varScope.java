package day5;

public class varScope {
    public static void main(String[] args) {
        //1.java属性中变量主要分为成员变量和局部变量
        //2.我们一般说的局部变量一般是指成员方法中的定义的变量
        //3.java中的作用域分类  全局变量也就是成员变量,作用域为整个类 , 局部变量 也就是 方法中的变量,作用域为当前代码块
        //4.全局变量具有默认值.局部变量没有默认值

    }
}
class Cat{
    //成员变量
    int age = 10;
    double weight;//成员变量有默认值
    public void hi(){
        int num = 1;//局部变量没有默认值,使用时会提示变量没有初始化
        System.out.println(num);
        System.out.println(weight);
    }

    public void cry(){
        int n = 10;//局部变量
        String name = "jack";
    }
    public void eat(){
        System.out.println("在eat中使用age = "+ age);
        // System.out.println("在eat中使用name= " + name);
    }
}


