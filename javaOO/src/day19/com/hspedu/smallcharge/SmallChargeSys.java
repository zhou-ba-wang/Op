package day19.com.hspedu.smallcharge;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * name: 零钱通
 * author： king
 */
public class SmallChargeSys {
    //1.化繁为简
    //1.1先完成显示菜单
    //1.2完成零钱通明细
    //1.2.1 老韩思路，收益和消费保存在数组；对象；String拼接
    //1.2.2使用String拼接
    //1.3收益入账
    //1.4消费


    public static void main(String[] args) {
        //定义相关变量
        boolean loop = true;
        String key = " ";
        //1.2.1 老韩思路，收益和消费保存在数组；对象；String拼接
        //1.2.2使用String拼接
        String details = "===============零钱通明细=================";
        //1.3.1定义新的变量（功能驱动）
        double money = 0;
        double balance= 0;
        Date dates = null;
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //1.4.1，消费说明
        String note = "";


        do {
            System.out.println("============零钱通菜单===============");
            System.out.println("\t\t\t1.零钱通明细");
            System.out.println("\t\t\t2.收益入账");
            System.out.println("\t\t\t3.消费情况");
            System.out.println("\t\t\t4. 退 出");
            System.out.println("===================================");
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的选择（1-4）");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println(details);
                    break;
                case "2":
                    System.out.println("收益入账金额");
                    money = scanner.nextDouble();
                    // money值的校验（）
                    if(money > 0){
                        balance += money;}
                    else{
                        System.out.println("收益金额不合法");
                        break;
                    }
                    //拼接收益入账信息到零钱通明细
                    dates = new Date();

                    details += "\n收益入账\t+" + money + "\t收益时间:" + sdf.format(dates) + "\t余额：" + balance;
                    break;
                case "3":
                    System.out.println("请输入消费说明");
                    note = scanner.next();
                    System.out.println("请输入消费金额");
                    money = scanner.nextDouble();
                    if(money < balance && money > 0){
                        // money值的校验（）
                        balance -= money;}
                    else{
                        System.out.println("消费金额不合法");
                        break;
                    }
                    //拼接收益入账信息到零钱通明细
                    dates = new Date();

                    details += "\n"+ note+ "\t -" + money + "\t消费时间:" + sdf.format(dates) + "\t余额：" + balance;
                    break;
                case "4":

                    char choose = 'a';
                    while(choose != 'y' && choose != 'n'){
                        System.out.println("是否确认退出(y/n)");
                        choose = scanner.next().charAt(0);
                        if(choose == 'y'){
                            loop = false;
                        }
                    }



                    break;
                default:
                    System.out.println("输入错误");
                    break;
            }


        } while (loop);
        System.out.println("退出了零钱通项目");

    }
}