package day11.com.hspedu.extend;

public class Pupil{
    public String name;
    public int age;
    private double socre;

    public void setSocre(double socre) {
        if(socre >= 0 && socre <=100)
        this.socre = socre;
    }
    public void testing(){
        System.out.println("小学生" + this.name  +" 正在考小学数学");
    }
    public void showInfo(){
        System.out.println("小学生名字是: " + this.name + " 年龄: " + this.age + " 成绩: " + +this.socre);
    }
}
