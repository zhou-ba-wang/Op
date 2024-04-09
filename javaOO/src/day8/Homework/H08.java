package day8.Homework;

public class H08 {
    int count = 9;
    public void count1(){
        count = 10;
        System.out.println("count1 = " + count);

    }
    public void count2(){
        System.out.println("count2 =" + count++);
    }
    public static void main(String[] args) {
        new H08().count1();//10
        H08 t1 = new H08();//
        t1.count2();//9
        t1.count2();//10

    }
}
