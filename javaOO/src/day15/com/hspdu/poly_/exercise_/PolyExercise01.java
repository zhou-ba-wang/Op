package day15.com.hspdu.poly_.exercise_;

public class PolyExercise01 {
    public static void main(String[] args) {
        double d = 13.4;
        long l = (long)d;
        System.out.println(l);
        int in = 5;
       // boolean b = (boolean)in;
        Object obj = "Hello";//向上转型
        String objStr = (String)obj;//向下转型
        System.out.println(objStr);
        Object objPri = new Integer(5);//向上转型
       // String str = (String)objPri;//objPri的运行类型为Integer,不能向下转型为编译类型为String的对象
        Integer str1 = (Integer)objPri; //向下转型

    }
}
