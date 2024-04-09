package day9;

import java.util.Scanner;

public class MyTools {
    //int[] a = {21,432,56,13,56,643,135,652} ;
    public void bubblingSort(int... a) {
        for (int i = a.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] < a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }


    public void printArr(int... a) {
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] a = {21, 432, 56, 13, 56, 643, 135, 652};
        MyTools m = new MyTools();
        System.out.println("排序前的数组");
        m.printArr(a);
        System.out.println("降序排序后的数组");
        m.bubblingSort(a);
        m.printArr(a);



    }
}
