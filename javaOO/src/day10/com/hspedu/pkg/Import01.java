package day10.com.hspedu.pkg;

import java.util.Arrays;

//import  java.util.Scanner;只引入Scanner这个类
//import java.util.*; //将util包下的所有类引入
//老韩建议,我们需要什么类,就导入那个类
public class Import01 {
    public static void main(String[] args) {
        //实践案例,用系统提供的Arrays完成排序
        int[] arr = {123,124,5,125,513};
        //对其进行排序
        //传统方法自己编写排序法
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

    }



}
