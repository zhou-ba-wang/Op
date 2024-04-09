package day15.com.hspdu.poly_.detail_;



public class Cat extends Animal {
    public void eat(){//重写方法
        System.out.println("猫爱吃鱼");
    }
    public void catchMouse(){//特有方法
        System.out.println("猫捉老鼠");
    }
}
