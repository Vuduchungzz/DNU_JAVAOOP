package exercises.oop.inheritance.person;

import java.util.Scanner;

public class Student extends Person {
    private String studentId;
    private String nameSchool;

    public Student(){}
    public Student(String name, int age, String address, String studentId, String nameSchool){
        super(name, age, address);
        this.studentId=studentId; this.nameSchool=nameSchool;
    }

    public String getStudentId(){ return studentId; }
    public void setStudentId(String studentId){ this.studentId=studentId; }
    public String getNameSchool(){ return nameSchool; }
    public void setNameSchool(String nameSchool){ this.nameSchool=nameSchool; }

    @Override public String toString(){
        return "Student{" + "name='"+getName()+"', age="+getAge()+", address='"+getAddress()+"', studentId='"+studentId+"', nameSchool='"+nameSchool+"'}";
    }

    @Override public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã SV: "); studentId = sc.nextLine();
        System.out.print("Trường: "); nameSchool = sc.nextLine();
    }

    public boolean checkStudentId(){
        return studentId != null && studentId.startsWith("23IT");
    }
}
