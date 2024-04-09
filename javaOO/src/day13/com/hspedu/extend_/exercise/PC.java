package day13.com.hspedu.extend_.exercise;

public class PC extends Computer{
    String brand;

    public PC(String CPU, String RMA, String hardDrive, String brand) {
        super(CPU, RMA, hardDrive);
        this.brand = brand;
    }
    public void print(){
        System.out.println("PC:");
        System.out.println(getDetail() +  "brand:  " + brand);
    }
}
