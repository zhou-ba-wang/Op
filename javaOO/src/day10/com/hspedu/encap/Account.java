package day10.com.hspedu.encap;

public class Account {
    public String name;
    private double balance;
    private String password;

    public Account(String name, double balance, String password) {
        setName(name);
        setPassword(password);
        setBalance(balance);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 2 && name.length() <=4)
        this.name = name;
        else{
            System.out.println("姓名不合法,输入默认值李华");
            this.name = "李华";
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if(balance > 20)
        this.balance = balance;
        else {
            this.balance = 20.1;
        }
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {
        if(password.length() == 6)
        this.password = password;
        else{
            System.out.println("密码不合法,输入默认值123456");
            this.password = "123456";
        }

    }
    public String info(){
        return "你的账户信息" + " 姓名:" + this.name + " 密码:" + this.password + " 余额:" + this.balance + "元";
    }
}
