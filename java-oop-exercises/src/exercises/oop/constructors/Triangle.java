package exercises.oop.constructors;

public class Triangle {
    private double sideA, sideB, sideC;
    public Triangle(){}
    public Triangle(double a, double b, double c){ this.sideA=a; this.sideB=b; this.sideC=c; }
    public double getSideA(){ return sideA; }
    public void setSideA(double sideA){ this.sideA=sideA; }
    public double getSideB(){ return sideB; }
    public void setSideB(double sideB){ this.sideB=sideB; }
    public double getSideC(){ return sideC; }
    public void setSideC(double sideC){ this.sideC=sideC; }
    @Override public String toString(){ return "Triangle{a=" + sideA + ", b=" + sideB + ", c=" + sideC + "}"; }
}
