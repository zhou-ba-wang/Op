package day3;

public class RecursionExercise01 {
    public static void main(String[] args) {
        Tools ts = new Tools();
       // int n = ts.f(4);
        int n = ts.f1(10);
        System.out.println(n);
    }
}
class Tools{
    public int f(int n){

            if (n == 1 || n == 2) {
                return 1;
            } else {
                return f(n - 1) + f(n - 2);
            }
        }
      public int f1(int n){//猴子吃桃问题
        if( n == 1  ){
            return 1;
        }else{
            return  (f1(n-1) + 1) * 2;
        }

        }




}

