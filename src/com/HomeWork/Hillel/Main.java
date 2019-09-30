package com.HomeWork.Hillel;

public class Main {

    public static void main(String[] args) {
        Group group = new Group("ВВП Java", "12.08.2019", 16, 2);
        Person firstStudent = new Person ("Юра", "Горб", 1);
        String nameGroup = Group.getNameGroup();
        String lastWeekOfStudies = Group.getLastDateOfStudies();


        System.out.println(nameGroup);
        System.out.println(lastWeekOfStudies);
    }
}
