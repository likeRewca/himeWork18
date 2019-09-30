package com.HomeWork.Hillel;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Group {

    protected static String nameCourse;
    protected static String startOfClasses;
    protected static int sumOfClasses;
    protected static int numberClassesOnWeek;
    protected static ArrayList<Person> studentsOfGroup;

    public Group (String nameCourse, String startOfClasses, int sumOfClasses, int numberClassesOnWeek){
        Group.nameCourse = nameCourse;
        Group.startOfClasses = startOfClasses;
        Group.sumOfClasses = sumOfClasses;
        Group.numberClassesOnWeek = numberClassesOnWeek;
    }

    public static String getNameGroup(){
        return "Курс: " + nameCourse + " (" + startOfClasses + ").";
    }
    public static String getLastDateOfStudies(){
        return "На " + (sumOfClasses/numberClassesOnWeek) + " недели будут последнии " + numberClassesOnWeek + " занятия.";
    }
    public static ArrayList<Person> listOfGroup (){
        return studentsOfGroup;
    }
    public static void addStudent (Person student){
        studentsOfGroup.add(student);
    }
    public static boolean findStudent(Person arraysLastNames){
        return Arrays.asList(studentsOfGroup).contains(arraysLastNames);
    }
    public static Person[] removeElement(Person[] remainingLastName, int index){
        List<Person> arrOut = new ArrayList<>(Arrays.asList(remainingLastName));
        arrOut.remove(index);
        return arrOut.toArray(new Person[0]);
    }

}
