package day7.Homework;

public class H01 {
    public static void main(String[] args) {
        double[] a = {33.4,245.5,234.9,2234.0,332.3};
        Tools t1 = new Tools();
        System.out.println(t1.max(a));
        String[] s1 = {"tom","jery","bob","jenifer","frank","make"};
        System.out.println(t1.find("bob",s1));


    }
}
class Tools{
    public double max(double... a){
        double max = -10000.0;
        for(int i = 0; i < a.length ; i++){
            if(a[i] >= max ){
                max = a[i];
            }
        }
        return max;

    }
    public int find(String  s , String... s1) {
        int i = 0;
        for ( i = 0; i < s1.length; i++) {
            if (s.equals(s1[i])) {

                break;
            }
            if (!s.equals(s1[i]) && i == s1.length - 1) {
                i = -1;
                break;
            }

        }
        return i;
    }
}
