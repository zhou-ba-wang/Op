package day8.Homework;

public class H10 {

}
class Demo{
    int i = 100;
    public void m(){
        int j = i++;
        System.out.println("i=" + i);//101
        System.out.println("j=" + j);//100

    }
}
class Test{
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = d1;
        d2.m();
        System.out.println(d1.i);//101
        System.out.println(d2.i);//101
    }
}