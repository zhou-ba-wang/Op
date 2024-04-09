package day3;
//基本数据类型的传参机制
public class MethodParameter01 {
    public static void main(String[] args) {

        MethodParameter01 m = new MethodParameter01();
        int a = 10;
        int b = 20;
        m.swap(a,b);//值传递
        System.out.println("a = " + a + "    b = " + b);//a = 10    b = 20
    }
    public void swap(int a,int b){
        //完成了a 和 b的交换的值

        int temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a +" " +  "b = " + b);
    }
}
