package exercises.oop.inheritance.shape;

import java.util.Scanner;

public class Rectangle {
    private float width;
    private float height;

    public Rectangle(){}
    public Rectangle(float width, float height){ this.width=width; this.height=height; }

    public float getWidth(){ return width; }
    public void setWidth(float width){ this.width=width; }
    public float getHeight(){ return height; }
    public void setHeight(float height){ this.height=height; }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiều rộng: "); width = sc.nextFloat();
        System.out.print("Chiều dài: "); height = sc.nextFloat();
    }

    public float getArea(){ return width * height; }
    public float getPerimeter(){ return 2*(width + height); }

    @Override public String toString(){ return "Rectangle{width="+width+", height="+height+"}"; }
}
