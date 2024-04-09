package day4;

public class HanoiTower {
    public static void main(String[] args) {
    Tower t = new Tower();
    int floor  = 2;
    char a = 'a';
    char b = 'b';
    char c = 'c';
    t.move(floor,a,b,c);
    }
}
class Tower{
    //方法
    //num 表示要移动的个数,a,b,c分别表示A塔, B塔, C塔
    //将借助 b ,将 a塔的盘移动到 c塔的盘
    public void move(int num , char a, char b, char c ) {
    //如果只有一个盘 num = 1
        if(num == 1){
            System.out.println(a + "->" + c);
        }else{
            //如果有多个盘,则看成两个盘,最下面的盘和上面所有的盘(num -1)
            //(1)先移动上面所有的盘到 b, 借助c
            move(num - 1,a,c,b);
            //(2)将最下面的盘,从a塔移动到c
            System.out.println(a + "->" + c);
            //(3)将b塔的所有盘移动到c,借助a
            move(num-1,b,a,c);
        }
    }
}
