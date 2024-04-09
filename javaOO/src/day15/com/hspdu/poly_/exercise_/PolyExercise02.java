package day15.com.hspdu.poly_.exercise_;

public class PolyExercise02 {
    public static void main(String[] args) {
        Sub s = new Sub();
        s.display();
        Base b = s;//向上转型
        System.out.println(b==s);//比较的是地址 true
        System.out.println(b.count);//10
        b.display();//20
    }
}
class Base{
    int count = 10;
    public void display(){
        System.out.println(this.count);
    }

}
class Sub extends Base{
    int count = 20;
    public void display(){
        System.out.println(this.count);
    }
}
