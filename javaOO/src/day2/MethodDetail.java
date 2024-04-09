package day2;

public class MethodDetail {
    public static void main(String[] args) {
        AA a = new AA();

        int[]  res = a.getSumAndSub(10,20);
        for(int i = 0; i < res.length; i++ ){
            System.out.println(res[i] + " ");
        }

    }
}
class AA {
    //返回多个结果
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

}
