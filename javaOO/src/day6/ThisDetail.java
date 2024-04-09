package day6;

public class ThisDetail {
    public static void main(String[] args) {
        T t1 = new T();
        t1.f2();
        T t2 = new T();
        t2.f2();


    }
}
class T{
    String name;
    public T(){
        this("joker");
        System.out.println("无参构造器被调用");

    }
    //this构造器调用语法只能用this
    public T(String name){
        this.name = name;
        System.out.println("构造器 public T(String name)被调用");

    }
   public void f1(){
       System.out.println("f1()被调用.");
   }
    public void f2(){
        System.out.println("f2()被调用.");
        //f2中调用f1方法,的两个方法
        f1();
        this.f1();
        System.out.println(this.hashCode());
    }
}
