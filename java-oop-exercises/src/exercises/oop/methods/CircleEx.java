package exercises.oop.methods;

public class CircleEx {
    private double radius;
    public CircleEx(){}
    public CircleEx(double radius){ this.radius=radius; }
    public double getRadius(){ return radius; }
    public void setRadius(double radius){ this.radius=radius; }
    public double getArea(){ return Math.PI*radius*radius; }
    public double getPerimeter(){ return 2*Math.PI*radius; }
    @Override public String toString(){ return "CircleEx{radius="+radius+"}"; }
}
