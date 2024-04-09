package day18.com.hspedu.object_;

public class Finalize_ {
    public static void main(String[] args) {
       Car bmw = new Car("bmw");

       bmw = null;//这时 bmw原来指向的对象就是个垃圾对象垃圾回收器就会回收（销毁）对象，
        // 在回收对象前会调用对象finalize_方法，因此程序员可以写业务逻辑(释放资源，数据库连接，打开文件)
        //如果程序员不重写方法finalize,那么就会调用Object类的finalize方法，
        //    protected void finalize() throws Throwable { }啥都没做
        System.gc();//主动调用垃圾回收器
    }
}
class Car{
    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("销毁汽车" + name);
        System.out.println("释放了某些资源");
    }
}
