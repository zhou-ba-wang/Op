package day8.Homework;

public class H09 {
    public static void main(String[] args) {

    }
}
class music{
    String name;
    String times;
    public void play(){
        System.out.println(this.name + "正在播放");
    }
    public String[]  getInfo(){
        String[] info = {this.name,this.times};
        return info;
    }
}
