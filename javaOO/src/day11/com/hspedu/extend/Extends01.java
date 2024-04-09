package day11.com.hspedu.extend;

public class Extends01 {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age =  12;
        pupil.setSocre(60);
        pupil.testing();
        pupil.showInfo();
        System.out.println("============================================");
        Graduate graduate = new Graduate();
        graduate.name = "大明";
        graduate.age = 20;
        graduate.setSocre(60);
        graduate.testing();
        graduate.showInfo();
    }
}

