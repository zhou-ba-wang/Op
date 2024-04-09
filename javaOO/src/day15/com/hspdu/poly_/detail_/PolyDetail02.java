package day15.com.hspdu.poly_.detail_;
public class PolyDetail02 {
    public static void main(String[] args) {
        //属性没有重写之说,对应调用的属性看编译类型`
        Base base = new Sub();//向上转型
        System.out.println(base.num);
    }
}
class Base{
    int num = 10;
}
class Sub extends Base{
    int num = 20;
}
