package day8.Homework;


import java.util.Scanner;

public class H14 {
    public static void main(String[] args) {
    char goOn = 'y';

    int count = 0;
    Tom t = new Tom();
    while(goOn == 'y'){
        t.match();
        count++;
        System.out.println("局数 " + count +"\t"+ "赢 " + t.win +"\t" + "输 " + t.defent);
        System.out.println("是否继续猜拳(y表示继续)");
        Scanner scanner = new Scanner(System.in);
        goOn = scanner.next().charAt(0);
    }


    }

}
class Tom{
    int num;
    int win = 0;
    int defent = 0;
    public void  randomNumber(){
        this.num =  (int)(Math.random() * 100) % 3;
    }
    public void match(){
        System.out.println("请输出你的选择 0表示石头,1表示剪刀,2表示布");
        Scanner scanner = new Scanner(System.in);
        int choice  = scanner.nextInt();
        randomNumber();
        //抽象一下,用一个二维数组
        int[][] isWin = new int[3][3];
        for(int i = 0 ; i < isWin.length ; i++){
            for (int j = 0 ; j <  isWin[i].length ; j++){
                if((i == 0 && j== 1) || (i == 1 && j == 2) || (i == 2 && j == 0)) {
                    isWin[i][j] = 1;//win
                }
                else if((j == 0 && i== 1) || (j == 1 && i == 2) || (j == 2 && i == 0)){
                    isWin[i][j] = 2;//defent
                }
            }
        }
        if(isWin[choice][this.num] == 1){
            System.out.println("Tom赢");
            this.win++;
        }else if(isWin[choice][this.num] == 2){
            System.out.println("Tom输");
            this.defent++;
        }
    }
}
