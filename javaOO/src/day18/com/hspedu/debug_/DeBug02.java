package day18.com.hspedu.debug_;

import java.sql.SQLOutput;

public class DeBug02 {
    public static void main(String[] args) {
        int[] arr = {1,10,-2};
        //debug数组
        for (int i = 0; i < arr.length ; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        System.out.println("推出for循环");
    }
}
