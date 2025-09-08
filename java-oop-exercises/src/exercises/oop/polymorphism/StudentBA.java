package exercises.oop.polymorphism;

import java.util.Scanner;

public class StudentBA extends Student {
    private float scorePM; // Project Management
    private float scoreMkt; // Marketing

    public StudentBA(){}
    public StudentBA(String studentID, String name, int age, float scorePM, float scoreMkt){
        super(studentID, name, age);
        this.scorePM=inRange(scorePM); this.scoreMkt=inRange(scoreMkt);
    }

    private float inRange(float s){
        if (s<0 || s>10) return 0;
        return s;
    }

    public float getScorePM(){ return scorePM; }
    public void setScorePM(float s){ this.scorePM=inRange(s); }
    public float getScoreMkt(){ return scoreMkt; }
    public void setScoreMkt(float s){ this.scoreMkt=inRange(s); }

    public float calculateAverage(){ return (scorePM + scoreMkt) / 2f; }

    @Override public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Điểm PM: "); setScorePM(Float.parseFloat(sc.nextLine()));
        System.out.print("Điểm MKT: "); setScoreMkt(Float.parseFloat(sc.nextLine()));
    }

    @Override public String toString(){
        return "StudentBA{" + super.toString() + ", scorePM=" + scorePM + ", scoreMkt=" + scoreMkt + ", avg=" + calculateAverage() + "}";
    }

    public StudentBA copyObject(){
        return new StudentBA(getStudentID(), getName(), getAge(), scorePM, scoreMkt);
    }
}
