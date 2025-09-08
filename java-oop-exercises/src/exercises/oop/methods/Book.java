package exercises.oop.methods;

import java.util.Scanner;

public class Book {
    private String name;
    private double price;
    private int quantity;
    public Book(){}
    public Book(String name, double price, int quantity){
        this.name=name; this.price=price; this.quantity=quantity;
    }
    public String getName(){ return name; }
    public void setName(String name){ this.name=name; }
    public double getPrice(){ return price; }
    public void setPrice(double price){ this.price=price; }
    public int getQuantity(){ return quantity; }
    public void setQuantity(int quantity){ this.quantity=quantity; }

    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Tên sách: "); name = sc.nextLine();
        System.out.print("Giá: "); price = sc.nextDouble();
        System.out.print("SL: "); quantity = sc.nextInt();
    }

    @Override public String toString(){ return "Book{name='"+name+"', price="+price+", quantity="+quantity+"}"; }
}
