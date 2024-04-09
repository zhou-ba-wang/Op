package day2;

public class Method02 {
    public static void main(String[] args) {
        int[][] map = {{0,0,1},{1,1,1},{1,1,3}};
        //传统解决方法,问题代码冗余
        for(int i = 0; i < map.length ;i++){
            for(int j = 0 ; j < map[i].length ; j++){
                System.out.print(map[i][j] + "\t");
            }
            System.out.println("");
        }

        int[][] arr = {{0,0,1,2},{2,3,1,4},{1,5,6,3}};
        MyTools T1 = new MyTools();
        T1.PrintArray(arr);

    }

}
class MyTools {
    public void PrintArray(int[][] map){
        System.out.println("==================================");
        for(int i = 0; i < map.length ;i++){
            for(int j = 0 ; j < map[i].length ; j++){
                System.out.print(map[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}

