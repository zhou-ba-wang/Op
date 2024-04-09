package day7.Homework;

public class H06 {
    public static void main(String[] args) {
        Cale cale1 = new Cale(23.4,902.2);
        Cale cale2 = new Cale(32.3,32.2);
        System.out.println(cale1.add() + " " +cale1.subtract()+ " " + cale1.archaic() +" "+ cale1.division());

    }
}
class Cale{
    double op1;
    double op2;
    Cale(double op1,double op2){
        this.op1 = op1;
        this.op2 = op2;
    }
    public double add(){
        return this.op1 + this.op2;
    }
    public double subtract(){
        return  this.op1 - this.op2;
    }
    public  double  archaic(){
        return this.op2 * this.op1;
    }
    public double  division(){
        if(this.op2 == 0){
            System.out.println("0不能做除数");
            return 0;
        }
        else{
            return this.op1 / this.op2;
        }
    }
}
