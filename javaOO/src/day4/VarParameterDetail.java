package day4;

public class VarParameterDetail {
    public static void main(String[] args) {
        //int[] a = {1};
        VD vd = new VD();
        //可变参数可以是0 -> 多个实参
        vd.f();
        vd.f(1,2,3);
        //可变参数的实参可以是一个数组
        int[] a = {1,3,5,5};
        vd.f(a);
        //

    }
}
class VD{
    public int f(int ... nums){
        //可变参数本质就是一个数组
        int res = 0;
        for(int i = 0; i < nums.length ; i++){
            res += nums[i];
        }
        return res;
    }
    //可变参数可以和普通类型的参数一起放在形参列表,但必须保证可变参数在最后
    public int f(String s,int ... nums){
        int res = 0;
        for(int i = 0; i < nums.length ; i++){
            res += nums[i];
        }
        return res;
    }
    //形参列表只能出现一个可变参数
//    public int f(String s,int ... nums,int ... nums1){
//        int res = 0;
//        for(int i = 0; i < nums.length ; i++){
//            res += nums[i];
//        }
//        return res;
//    }


}
