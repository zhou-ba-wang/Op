package day14.com.hspedu.override_;

public class Dog extends Animal{
    //dog是animal的子类
    //dog cry()定义与animal的形式一样
    //这时doy的cry()方法重写了animal的cry方法
    public void cry(){
        System.out.println("小狗汪汪叫");
    }
    public String m1(){
        return null;//返回值可以为父类对应方法的放回值的子类
      }
}
