package day2;

public class MethodExercise01 {
    public static void main(String[] args) {
        AA1 a = new AA1();
        int n =10;
        if(a.odd(n)){
            System.out.println(n + "是奇数好吧");
        }else{
            System.out.println(n + "是偶数好吧");
        }
        BB b = new BB();
        char[][] c={{'w','$','z','5'},{'s','&','*',')'},{'x','m','^',')'},{'_','-','+','\\'}};
        b.printChar(c);

    }
}
class AA1{
    public boolean odd(int n){
        if(n % 2 == 0){
//            char[][] d =     {{'w','$','z','5'},{'s','&','*',')'},{'x','m','^',')'},{'_','-','+','\\'}};
//            BB b = new BB();
//            b.printChar(d);
            return false;
        }else {
            return true;
        }

    }

}
class BB{
    public void printChar(char[][] c){
        for(int i = 0; i < c.length; i++){
            for(int j = 0 ; j < c[i].length ; j++){
                System.out.println("行: " + (i+1) + "列: " + (j+1) + "字符:" + c[i][j]);
            }
        }
    }
}
