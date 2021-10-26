package com.thevarungupta.Day4;

class Student {
    private int studentId;
    private String studentName;
    private int passMark = 40;

    // setter
    public void setStudentId(int id) throws Exception {
        if(id <= 0){
            throw new Exception("id cannot be -ve");
        }
        this.studentId = id;
    }

    // getter
    public int getStudentId(){
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) throws Exception {
        if(studentName == ""){
            throw  new Exception("name cannot blank");
        }
        this.studentName = studentName;
    }

    public int getPassMark() {
        return passMark;
    }

}

public class Demo1 {
    public static void main(String[] args) throws Exception {
        Student student = new Student();
//        student.studentId = -1;
//        student.studentName = null;
//        student.passMark = 20;
//
//        System.out.println("Student: Id: " + student.studentId + ", Name: "
//                + student.studentName + ", Pass Mark = " + student.passMark);

        student.setStudentId(10);
        student.setStudentName("Mark");
        System.out.println("Student Id : "+ student.getStudentId());
        System.out.println("Student Name : "+ student.getStudentName());

    }
}
