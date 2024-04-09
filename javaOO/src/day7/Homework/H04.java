package day7.Homework;

public class H04 {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,5,6,7,7,2,24};
        A03 a03 = new A03();
        int[] b = a03.copyArr(a);
        for(int i = 0; i < b.length; i++){
            System.out.print(b[i] + "  ");
        }

    }
}
class A03{
    public int[] copyArr(int...a){
        int[] newArr = new int[a.length];
        for(int i = 0; i < a.length; i++){
            newArr[i] = a[i];
        }
        return newArr;
    }
}
