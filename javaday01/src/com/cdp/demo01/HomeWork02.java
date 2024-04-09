package com.cdp.demo01;

public class HomeWork02 {
    public static void main(String[] args) {
        //一直有一个升序的数组,要求插入一个元素,该数组的顺序依旧是升序,比如
        //[10,12,45,90],添加23后,数组为[10,12,23,45,90]
        //化繁为简
        //添加末尾添加23
        int[] arr = {10,12,45,90};
        int[] arrN = new int[arr.length + 1];
        for(int i = 0; i < arr.length ; i++){
            arrN[i] = arr[i];
        }
        arrN[arr.length] = 23;
        arr = arrN;
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }
        for(int i = arr.length - 1 ; i > 0; i--){
            for(int j = 0; j < i ; j++){
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("排序后");
        for(int i = 0; i < arr.length ; i++){
            System.out.print(arr[i] + "\t");
        }

    }
}
