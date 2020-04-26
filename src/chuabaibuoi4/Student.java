package chuabaibuoi4;

import java.util.Scanner;

public class Student {
    private String name;
    private String mssv;
    private Float gpa;

    public Student(String name, String mssv, Float gpa) {
        this.name = name;
        this.mssv = mssv;
        this.gpa = gpa;
    }

    public Student(String name, Float gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public Float getGpa() {
        return gpa;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        this.name = scanner.nextLine();
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", mssv='" + mssv + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
