package exercises.oop.inheritance.shape;

import java.util.Scanner;

public class Square extends Rectangle {
    public Square(){}
    public Square(float side){ super(side, side); }

    public float getSide(){ return super.getWidth(); }
    public void setSide(float side){ super.setWidth(side); super.setHeight(side); }

    @Override public String toString(){ return "Square{side=" + getSide() + "}"; }

    @Override public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Cạnh: "); float s = sc.nextFloat();
        setSide(s);
    }
}
