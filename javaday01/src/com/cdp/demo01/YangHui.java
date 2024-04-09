package com.cdp.demo01;

import sun.misc.PostVMInitHook;

public class YangHui {
    public static void main(String[] args) {
//        使用二维数组打印一个杨辉三角形如
//        1
//        11    a[2][1] = a[1][1] + a[1][0]
//        121
//        1331
        //化繁为简
        //打印一个全为1的
        int storey = 10;
        int[][] arr = new int[storey][];//二维数组还可以 int[] y[]
        for(int i = 0; i < arr.length; i++){
            arr[i] = new int[i + 1];
            for(int j = 0; j < arr[i].length ; j++){
                if(i >= 2 && j >= 1 && j!=i){
                    arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                }else{
                arr[i][j] = 1;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length ; j++){
                System.out.print("\t" + arr[i][j] );
            }
            System.out.print('\n');
        }


    }
}
