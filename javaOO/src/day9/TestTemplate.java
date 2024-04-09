package day9;

import java.util.Arrays;

public class TestTemplate {
    //main就是一个模板
    public static void main(String[] args) {
        //sout
        System.out.println();
        //fori
        for (int i = 0; i < 100; i++) {

        }
        int[] arr = {123,14212,124};
        for(int i = 0 ; i < arr.length - 1 ; i++ ){
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }


    }
}
