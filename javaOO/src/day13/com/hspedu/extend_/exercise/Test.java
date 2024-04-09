package day13.com.hspedu.extend_.exercise;

public class Test {
    public static void main(String[] args) {
        PC pc = new PC("晓龙" , "300G", "夸克硬盘" , "huawei");
        NotePad notePad = new NotePad("麒麟","300G","量子硬盘","red");
        pc.print();
        notePad.print();

    }
}
