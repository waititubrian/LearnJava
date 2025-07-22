package oop.sms;

import java.util.ArrayList;
import java.util.List;

public class StudentManager{
    private List<Student> students;

    public StudentManager(){
        students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void viewAllStudents(){
        if (students.isEmpty()){
            System.out.println("No students found.");
            return;
        }
        for (Student student : students){
            System.out.println(student);
        }
    }

    public Student findStudentById(String id){
        for (Student student : students){
            if (student.getId().equals(id))
                return student;
        }
        return null;
    }

    public boolean removeStudent(String id){
        Student student = findStudentById(id);
        if (student != null){
            students.remove(student);
            return true;
        }
        return false;
    }
}
