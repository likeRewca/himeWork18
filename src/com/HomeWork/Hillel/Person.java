package com.HomeWork.Hillel;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    protected static String nameOfStudent;
    protected static String lastOfStudent;
    protected static int numberStudent;

    public Person (String name, String lastName, int number){
        Person.nameOfStudent = name;
        Person.lastOfStudent = lastName;
        Person.numberStudent = number;
    }

    public String getNameStudents(){
        return nameOfStudent;
    }
    public String getLastOfStudent(){
        return lastOfStudent;
    }
    public int getNumberOfStudent(){
        return numberStudent;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nameOfStudent='" + nameOfStudent + '\'' +
                ", lastOfStudent='" + lastOfStudent + '\'' +
                ", numberStudent=" + numberStudent +
                '}';
    }
}
