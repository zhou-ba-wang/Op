package day1;

public class Object01 {
    public static void main(String[] args) {
//        String[] cat1 = {"小白","3岁","白色"};
//        String[] cat2 = {"小花","100岁","花色"};
//        //传统方法,不利于数据管理,数据类型体现不出来,只能通过下标获取信息,不能体现猫的行为
//        Scanner myScanner = new Scanner(System.in);
//        String catname = "";
//        System.out.println("请输入你要找的小猫的名字");
//        catname = myScanner.next();
//        if(cat2[0].equals(catname) || cat1[0].equals(catname)){
//            if(cat1.equals(catname)){
//                for(int i = 0; i < cat1.length; i++){
//                    System.out.print(cat1[i]);
//                }
//            }else {
//                for(int i = 0; i < cat2.length; i++){
//                    System.out.print(cat2[i]);
//                }
//            }
//        }else{
//            System.out.println("你没有这只猫猫");
//        }

        //使用OOP面向对象解决
        //1.创建一只猫 new day1.Cat()
        //2.将创建的一只猫赋给 cat1  day1.Cat cat1 = new day1.Cat();
        //3.cat1就是一个对象
        Cat cat1 = new Cat();
        cat1.name = "小白";
        cat1.age = 3;
        cat1.color = "白色";
        //创建了第二只猫,并且赋给 cat2
        //cat2也是一个对象
        Cat cat2 = new Cat();
        cat2.name = "小花";
        cat2.age = 100;
        cat2.color = "花色";
        //怎么访问对象的属性
        System.out.println("第一只猫信息" + cat1.name + " " + cat1.age + " " + cat1.color );
        System.out.println("第二只猫信息" + cat2.name + " " + cat2.age + " " + cat2.color );







    }
}
//使用面向对象的方法
//定义一个猫类 day1.Cat -> 自定义的数据类型
class Cat{
    //属性
    String name;
    int age;
    String color;
    //增加行为
    double weight;
}