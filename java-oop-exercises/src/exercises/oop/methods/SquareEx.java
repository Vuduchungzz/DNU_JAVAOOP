package exercises.oop.methods;

public class SquareEx {
    private double side;
    public SquareEx(){}
    public SquareEx(double side){ this.side=side; }
    public double getSide(){ return side; }
    public void setSide(double side){ this.side=side; }
    public double getArea(){ return side*side; }
    public double getPerimeter(){ return 4*side; }
    public boolean isIntegerSquareSide(){ return Math.floor(side) == side; }
    @Override public String toString(){ return "SquareEx{side="+side+"}"; }
}
