package day4;

public class VarParameter01 {
    public static void main(String[] args) {
    ZwyMethod zwy = new ZwyMethod();
        System.out.println(zwy.sum(1,2,4,23));
    }
}
class ZwyMethod {
    //可以计算2,3,4,5....的和
    //使用重载不好弄
    //.........
    //上面的方法名称不同,功能相同,参数个数不同->使用可变参数优化
    //1.int ...表示接受的是可变参数,类型是int,即可以接受多个int(0->多)
    //2.使用可变参数,可以将变量看作一个数组
    public int sum(int ... nums){
        System.out.println(nums.length);
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return sum;
    }
}

