package day7.Homework;

public class H03 {
    public static void main(String[] args) {
        Book b1 = new Book(160);
        Book b2 = new Book(120);
        b1.updatePrice(b1);
        b1.updatePrice(b2);
        System.out.println(b1.price + " " + b2.price);
    }

}
class Book{
    double price;
    Book(double price){
        this.price = price;
    }
    public void updatePrice(Book b){
        if(b.price > 150){
            b.price = 150;
        }else if(b.price > 100){
            b.price = 100;
        }

    }
}
