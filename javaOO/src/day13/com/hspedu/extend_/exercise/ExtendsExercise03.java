package day13.com.hspedu.extend_.exercise;

public class ExtendsExercise03 {
}

class Computer {
    String CPU;
    String RMA;
    String HardDrive;

    public Computer(String CPU, String RMA, String hardDrive) {
        this.CPU = CPU;
        this.RMA = RMA;
        HardDrive = hardDrive;
    }

    public String getDetail() {
        return "CPU: " + this.CPU + " RMA: " + this.RMA + " HardDrive: " + this.HardDrive;
    }
}
