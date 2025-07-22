package oop.sms;

public class Student {
    private String id;
    private String name;
    private String course;
    private double gpa;

    public Student(String id, String name, String Course, double gpa){
        this.id = id;
        this.name = name;
        this.course = course;
        this.gpa = gpa;
    }

    public String getId(){return id;}

    public String getName(){return name;}

    public String getCourse(){return course;}

    public double getGpa(){
        return gpa;
    }

    @Override
    public String toString(){
        return "ID: " + id + ", Name: " + name + ", Course: " + course + ", GPA: " + gpa;
    }
}
