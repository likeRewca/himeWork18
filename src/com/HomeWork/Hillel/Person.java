package com.HomeWork.Hillel;

public class Person {

    protected String nameOfStudent;
    protected String lastOfStudent;
    protected String studentNumber;



    public Person (String studentNumber, String name, String lastName){
        this.studentNumber = studentNumber;
        this.nameOfStudent = name;
        this.lastOfStudent = lastName;
    }
    public String getNameOfStudent() {
        return nameOfStudent;
    }
    public String getLastOfStudent(){
        return lastOfStudent;
    }
    public String getStudentNumber() {
        return studentNumber;
    }

    @Override
    public String toString() {
        return "Ученик: " + "№ " + studentNumber + " - "
                + lastOfStudent + " " + nameOfStudent;
    }
}
