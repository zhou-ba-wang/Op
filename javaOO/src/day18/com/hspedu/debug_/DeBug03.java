package day18.com.hspedu.debug_;

import java.util.Arrays;

public class DeBug03 {
    public static void main(String[] args) {
        //debug源码
        int arr[] = {8,-1,199,70,10};
        //排序，追入sort的源码,
        //方法一Shift + F7
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + '\t');
        }
    }
}

