package day3;
//引用数据类型的传参机制,地址赋值
//String类型除外
public class MethodParameter02 {
    public static void main(String[] args) {
        int[] arr = {23,65,33,66};
        B b = new B();
        b.test100(arr);
        for(int i = 0; i < arr.length ; i++){
            System.out.println("arr" + "[" + i + "] =" + arr[i]);
        }
       Person p = new Person();
        p.age = 10;
        p.sal = 0;
        b.test200(p);
        System.out.println("age = " + p.age  + " sal = " + p.sal);
        String s = "我不想你";
        b.test300(s);
        System.out.println(s);
    }
}
class B{
    public void test100(int[] arr){
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = i;
        }
    }
    public void test200(Person p){
        p.age = 100;
        p.sal = 3000.0;
    }
    public void test300(String s){
        s = "我好想你";
    }
}
class Person{
    int age;
    double sal;
}