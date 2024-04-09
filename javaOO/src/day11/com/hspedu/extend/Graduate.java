package day11.com.hspedu.extend;

public class Graduate {
    //模拟大学生考试的简单情况
    public String name;
    public int age;
    private double socre;

    public void setSocre(double socre) {
        if(socre >= 0 && socre <=100)
            this.socre = socre;
    }
    public void testing(){//和pupil的情况差不多
        System.out.println("大学生" + this.name  +" 正在考大学数学");
    }
    public void showInfo(){
        System.out.println("大学生名字是: " + this.name + " 年龄: " + this.age + " 成绩:" + +this.socre);
    }
}
