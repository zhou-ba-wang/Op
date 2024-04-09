package day3;
//迷宫游戏
public class MiGong {
    public static void main(String[] args) {
        //思路
        //1.先创建迷宫,用二维数组表示 int[][] map = new int[8][7];
        //2.先规定 map 数组的元素值: 0 表示没有障碍物(可以走)  1 表示有障碍物(不能走)

        int[][] map = new int[8][7];
        for(int i = 0 ; i < map.length ; i++){
            for(int j = 0; j < map[i].length ; j++){
                if(i == 0 || j == 0 || i == 7 || j == 6){
                    map[i][j] = 1;
                }
            }
        }
        map[3][1] = 1;
        map[3][2] = 1;
        map[2][5] = 1;
//        map[2][1] = 1;
//        map[2][2] = 1;
//        map[1][2] = 1;
        System.out.println("当前地图==============");
        for(int i = 0 ; i < map.length ; i++){
            for(int j = 0; j < map[i].length ; j++){
                    System.out.print(map[i][j] + "\t");
            }System.out.println();

        }
           T1 t = new T1();
           t.findWay1(map,1,1);
        System.out.println("找到路的地图如下++++++++++++");

        for(int i = 0 ; i < map.length ; i++){
            for(int j = 0; j < map[i].length ; j++){
                System.out.print(map[i][j] + "\t");
            }System.out.println();

        }

    }

}
class T1{
    //使用递归回溯的思想来解决老鼠出迷宫问题

    //1.findWay方法就是专门来找出迷宫的路径
    //2.如果找到,就返回true,否则就返回false;
    //3.map是迷宫, i, j是老鼠的位置,初始位置为(1,1)
    //4.因为使用递归来找路,所以就要规定 map数组各个值的含义
    //5. 0 表示可以走 1 表示障碍物 2 表示可以走 3表示走过但是是死路
    //6.当 map[6][5] = 2 时,说明找到通路,就可以退出,否则就继续找
    //7.先确定老鼠找路的策略 下 - > 右 -> 上 -> 左
    //8.改变策略 右->下->左->上

    public boolean findWay(int[][] map, int i, int j){
        if(map[6][5] == 2){//说明已经找到
            return true;
        }else{
            if(map[i][j] == 0){//当前位置为0,表示可以走
                map[i][j] = 2;
                if(findWay(map,i+1 ,j)){
                    return true;//往下走能走通
                }else if(findWay(map ,i,j+1 )){
                    return true;//往右走能走通
                }else if(findWay(map ,i-1 ,j )){
                    return true;//往上走能走通
                }else if(findWay(map ,i,j-1  )){
                    return true;//往左走能走通
                }else{
                    map[i][j] = 3;//都走不通,赋值为3
                    return false;
                }
            }else{//map[i][j] = 1 , 2 ,3
                return false;
            }
        }
    }
    public boolean findWay1(int[][] map, int i, int j){
        if(map[6][5] == 2){//说明已经找到
            return true;
        }else{
            if(map[i][j] == 0){//当前位置为0,表示可以走
                map[i][j] = 2;
                if(findWay1(map,i-1 ,j)){
                    return true;//往上走能走通
                }else if(findWay1(map ,i,j+1 )){
                    return true;//往右走能走通
                }else if(findWay1(map ,i+1 ,j )){
                    return true;//往下走能走通
                }else if(findWay1(map ,i,j-1  )){
                    return true;//往左走能走通
                }else{
                    map[i][j] = 3;//都走不通,赋值为3
                    return false;
                }
            }else{//map[i][j] = 1 , 2 ,3
                return false;
            }
        }
    }


}
