package com.cdp.demo01;

import java.sql.SQLOutput;

public class HomeWork03 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random()*100) + 1;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        for(int i =  arr.length - 1  ; i > 0  ; i--){
            for(int j = 0; j < i ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println("排序后");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
        int all = 0;
        double avg = 0;
        int maxIndex = 0;
        int max = 0;
        int minIndex = 0;
        int min = 100;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
            if(arr[i] < min){
                min = arr[i];
                minIndex = i;
            }
            all += arr[i];
        }
        avg = all / arr.length;
        System.out.println("平均值" + avg + "最大值下标" + maxIndex + "最小值下标" + minIndex);
        boolean flag = false;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 8){
                flag = true;
                break;
            }
        }
        if(flag)
        System.out.println("有8");
        else{
            System.out.println("没8");
        }
    }
}
