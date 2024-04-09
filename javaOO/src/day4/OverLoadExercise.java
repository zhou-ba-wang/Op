package day4;

public class OverLoadExercise {
    public static void main(String[] args) {
        Methods mt = new Methods();
        mt.m(10);
        mt.m(10,20);
        mt.m("666");

        System.out.println(mt.max(2.5,2.6,2.8));
        System.out.println(mt.max(2.5,2.6));
        System.out.println(mt.max(2,3));
    }
}
class Methods{
    public int m(int a){
        return a * a;
    }
    public int m(int a , int b){

        return a * b;
    }
    public void m(String a){
        System.out.println(a);
    }
    public int max(int a,int b){
        if(a>b)
        return a;
        else
            return b;
    }
    public double max(double a,double b){
        if(a>b)
            return a;
        else
            return b;
    }
    public double max(double a,double b,double c){
       double[] arr = new double[3];
       arr[0] = a;
       arr[1] = b;
       arr[2] = c;

       for(int i = 0 ; i < arr.length;i++){
           for(int j = 0 ; j < arr.length - i -1 ; j++){
               if(arr[j] < arr[j+1]){
                   double temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] =  temp;
               }
           }
       }return arr[0];

    }
}

