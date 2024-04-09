package day15.com.hspdu.poly_.detail_;

public class PolyDetail03 {
    public static void main(String[] args) {
        //bb的编译类型是 BB,运行类型 BB
        BB bb = new BB();
        System.out.println(bb instanceof  BB);
        System.out.println(bb instanceof  AA);
        //aa的编译类型是AA,运行类型 BB
        AA aa = new BB();
        System.out.println(aa instanceof  BB);//true
        System.out.println(aa instanceof  AA);//true
        //则instanceOf用于判断对象的运行类型是否为XX类型或XX类型的子类型
        AA cc =  new AA();
        System.out.println(cc instanceof  BB);
        System.out.println(cc instanceof  AA);



    }
}
class AA{ }
class BB extends AA{}
