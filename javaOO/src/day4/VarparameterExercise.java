package day4;

public class VarparameterExercise {
    public static void main(String[] args) {
        VPE vpe = new VPE();
        System.out.println(vpe.f("zwy",93.2,93.4,88.2));
    }
}
class VPE{
    public String f(String name , double ... nums){
        double sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];
        }
        return name +" "+sum;
    }


}
