package day17.com.hspedu.object_;

public class ToString_ {
    public static void main(String[] args) {
        Monster monster = new Monster("周山","java开发工程师",8000.0);
        System.out.println(monster);//toString自动被调用
        //Object的toString方法
        /*
            public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
        getClass().getName()全类名
         */
    }
}
class Monster {
   private String name;
   private  String job;
   private  double sal;

    public Monster(String name, String job, double sal) {
        this.name = name;
        this.job = job;
        this.sal = sal;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", sal=" + sal +
                '}';
    }
}
