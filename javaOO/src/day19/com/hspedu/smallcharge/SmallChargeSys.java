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
            System.out.println("请输入你的选择（1-4）");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("1.零钱通明细 ");
                    break;
                case 2:
                    System.out.println("2.消费入账");
                    break;
                case 3:
                    System.out.println(" 3.消费");
                    break;
                case 4:
                    System.out.println(" 4.退    出 ");
                    break;
                default:
                    System.out.println("错误选择");
                    break;
            }

        } while (choice != 4);


    }
}
