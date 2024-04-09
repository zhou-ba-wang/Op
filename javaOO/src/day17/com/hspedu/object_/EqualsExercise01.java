package day17.com.hspedu.object_;

public class EqualsExercise01 {
    public static void main(String[] args) {
        Person person = new Person("假老练", 20, '男');
        Person person1 = new Person("风车车", 30, '女');
        System.out.println(person1.equals(person));
        Person p = person1;
        System.out.println(p.equals(person1));
    }
}

class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public boolean equals(Object object) {//重写Object的equals方法
        if (this == object) {
            return true;
        }
        if (object instanceof Person) {
                Person person = (Person) object;
                if (this.age == person.age && this.name.equals(person.name) && this.gender == person.gender) {
                    return true;
                } else {
                    return false;
                }
        }
        return false;
    }
}
