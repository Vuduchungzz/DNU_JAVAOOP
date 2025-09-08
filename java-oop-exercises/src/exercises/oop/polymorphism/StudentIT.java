package exercises.oop.polymorphism;

import java.util.Scanner;

public class StudentIT extends Student {
    private float scoreCPP;
    private float scoreJava;

    public StudentIT(){}
    public StudentIT(String studentID, String name, int age, float scoreCPP, float scoreJava){
        super(studentID, name, age);
        this.scoreCPP = inRange(scoreCPP);
        this.scoreJava = inRange(scoreJava);
    }

    private float inRange(float s){
        if (s < 0 || s > 10) return 0;
        return s;
    }

    public float getScoreCPP(){ return scoreCPP; }
    public void setScoreCPP(float score){ this.scoreCPP = inRange(score); }
    public float getScoreJava(){ return scoreJava; }
    public void setScoreJava(float score){ this.scoreJava = inRange(score); }

    public float calculateAverage(){
        return (scoreCPP + scoreJava) / 2f;
    }

    @Override public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Điểm C++: "); setScoreCPP(Float.parseFloat(sc.nextLine()));
        System.out.print("Điểm Java: "); setScoreJava(Float.parseFloat(sc.nextLine()));
    }

    @Override public String toString(){
        return "StudentIT{" + super.toString() + ", scoreCPP=" + scoreCPP + ", scoreJava=" + scoreJava + ", avg=" + calculateAverage() + "}";
    }

    public StudentIT copyObject(){
        return new StudentIT(getStudentID(), getName(), getAge(), scoreCPP, scoreJava);
    }
}
