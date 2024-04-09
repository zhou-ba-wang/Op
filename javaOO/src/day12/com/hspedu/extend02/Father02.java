package day12.com.hspedu.extend02;

import javax.xml.ws.FaultAction;

public class Father02 extends TopBase {
    String name;
    int age;
    char gender;

    public Father02(String name, int age, char gender) {
        //默认super()
        this.name = name;
        this.age = age;
        this.gender = gender;
        System.out.println("Father02(String name, int age, char gender)被调用");
    }
}
