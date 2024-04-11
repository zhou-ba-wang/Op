package day19.com.hspedu.smallcharge;

import java.util.Scanner;

public class SmallChargeSys {
    public void MainOrder() {
        System.out.println("-------------------------零钱通菜单-----------------------------");
        System.out.println("                       1.零钱通明细                             ");
        System.out.println("                       2.消费入账                               ");
        System.out.println("                       3.消费                                  ");
        System.out.println("                       4.退    出                              ");
    }

    public static void main(String[] args) {
        SmallChargeSys smallChargeSys = new SmallChargeSys();
        int choice = 0;
        do {
            smallChargeSys.MainOrder();
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }

        } while (choice != 4);


    }
}
