package com.cdp.demo01;

public class TwoDimensionalArray05 {
    //遍历数组
    public static void main(String[] args) {
        int[][] arr ={{4,6},{1,4,5,7},{-2}};
        for(int i =0; i < arr.length ; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
