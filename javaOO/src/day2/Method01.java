package day2;

public class Method01 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.speak();
        System.out.println(p1.cal01());//计算1-100的和
        System.out.println(p1.cal02(1000));//计算 1 - n的和
        System.out.println(p1.getSum(100,200));//计算两个数的和
    }
}
class Person{
    int age;
    String name;
    void speak(){
        System.out.println("我是一个好人");
    }
    int cal01(){
        int num = 1000;
        int i = 1;
        int result = 0;
        while(num >= i) {
        result += i;
        i++;

        }
        return result;
    }
    int cal02(int n){
        int result = 0;
        int i = 1;
        while(n >= i){
            result += i;
            i++;
        }
        return result;
    }
    int getSum(int num1,int num2){
        return num1 + num2;
    }


}
