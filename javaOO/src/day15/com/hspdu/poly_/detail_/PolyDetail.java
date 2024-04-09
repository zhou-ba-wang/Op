package day15.com.hspdu.poly_.detail_;

public class PolyDetail {
    public static void main(String[] args) {
        //1.向上转型父类的引用 指向了子类对象
        //语法 父类 引用 = new 子类;
        Animal animal = new Cat();
        Object obj = new Cat();// Object 也是 cat 的父类
        //(1)animal不能调用子类的特有成员
        //(2)因为在编译阶段,能调用那些成员是由编译类型来决定的
        //(3)具体的运行效果看子类的具体实现,调用方法时按照从子类开始查找方法调用
        animal.eat();//猫爱吃鱼
        //2.向下转型
        //要求,父类的引用必须指向当前目标类型的对象
        //语法
        // 子类 引用 = (子类)向上转型父类的引用
        //我希望调用cat的catchMouse方法
        //编译类型 Cat ,运行类型 Cat
        Cat cat = (Cat)animal;



    }
}
