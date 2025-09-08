package exercises.oop.methods;

public class TriangleEx {
    private double sideA, sideB, sideC;
    public TriangleEx(){}
    public TriangleEx(double a, double b, double c){ set(a,b,c); }
    public double getSideA(){ return sideA; }
    public double getSideB(){ return sideB; }
    public double getSideC(){ return sideC; }

    public void set(double a, double b, double c){
        this.sideA=a; this.sideB=b; this.sideC=c;
    }

    public double getPerimeter(){ return sideA + sideB + sideC; }
    public double getArea(){
        double p = getPerimeter()/2.0;
        return Math.sqrt(Math.max(0, p*(p-sideA)*(p-sideB)*(p-sideC)));
    }
    public boolean isIsoscelesTriangle(){ return sideA==sideB || sideA==sideC || sideB==sideC; }
    public boolean isEquilateralTriangle(){ return sideA==sideB && sideB==sideC; }
    public boolean isRightTriangle(){
        double[] s = {sideA, sideB, sideC};
        java.util.Arrays.sort(s);
        return Math.abs(s[0]*s[0] + s[1]*s[1] - s[2]*s[2]) < 1e-9;
    }

    @Override public String toString(){ return "TriangleEx{a="+sideA+", b="+sideB+", c="+sideC+"}"; }
}
