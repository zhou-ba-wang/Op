package day13.com.hspedu.extend_.exercise;

public class NotePad extends Computer{
    String color;

    public NotePad(String CPU, String RMA, String hardDrive, String color) {
        super(CPU, RMA, hardDrive);
        this.color = color;
    }
    public void print(){
        System.out.println("NotePad:");
        System.out.println(getDetail() + " color:" + color);
    }
}
