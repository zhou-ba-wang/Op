package day11.com.hspedu.extend.improve;


import day11.com.hspedu.extend.improve.Pupil;


public class TestExtends01 {
    public static void main(String[] args) {
       Pupil pupil = new Pupil();
        pupil.name = "小明~";
        pupil.age =  11;
        pupil.setSocre(50);
        pupil.testing();
        pupil.showInfo();
        System.out.println("============================================");
       Graduate graduate = new Graduate();
        graduate.name = "大明~";
        graduate.age = 21;
        graduate.setSocre(80);
        graduate.testing();
        graduate.showInfo();
    }
}
