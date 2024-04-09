package day12.com.hspedu.extend02;

public class ExtendsTheory {
    //继承的本质
    public static void main(String[] args) {
        Son son = new Son();//内存的布局
        System.out.println(son.name);//
        //访问规则
        //1.如果该类存在对应属性并且后访问权限则访问对应的属性
        //2.如若不然放访问父类
        //3.向上访问
        //4.都没有报错
        System.out.println(son.age);
        System.out.println(son.hobby);
    }

}
class GrandPa{
    String name = "大头爷爷";
    String hobby = "旅游";
}
class Father extends  GrandPa{
    String name = "大头爸爸";
    int age = 39;
}
class Son extends Father{
    String name = "大头儿子";
}