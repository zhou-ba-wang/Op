package day16.com.hspedu.poly_.polyparamater_;

public class PolyParameter {
    public static void main(String[] args) {
     Employee e = new CommomEmployee("猪猪侠",3000);
     Employee e2 = new Manager("白雪公主",4000,10000);
        Text text = new Text();
        text.testWork(e);
        text.testWork(e2);

        System.out.println(text.showEmpAnnal(e));
        System.out.println(text.showEmpAnnal(e2));

    }

}
class Employee{
    private  String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public  double getAnnual(){
        return getSalary() * 12;
    }
}
class CommomEmployee extends Employee{
    public CommomEmployee(String name, double salary) {
        super(name, salary);
    }
    public void work(){
        System.out.println("员工 " + getName() + "正在工作"  );
    }
    public double getAnnual(){
        return super.getAnnual();
    }
}
class Manager extends Employee{
    private  double bomus ;
    public Manager(String name, double salary, double bomus) {
        super(name, salary) ;
        this.bomus = bomus;
    }
    public void  manage(){
        System.out.println( "manager "+ super.getName() + "正在管理公司");
    }
    public double getAnnual(){
        return super.getAnnual() + bomus;
    }

}
class Text{
    public double showEmpAnnal(Employee e){
        return e.getAnnual();
    }
    public void testWork(Employee e){
        if(e instanceof CommomEmployee){
            ((CommomEmployee) e).work();
        }else if( e instanceof Manager){
            ((Manager) e).manage();
        }
    }
}
