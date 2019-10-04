package com.HomeWork.Hillel;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {
        Group group = new Group("ВВП Java", "12.08.2019", 16, 2);
        Person person1 = new Person ( "1", "Юра", "Горб");
        Person person2 = new Person ("2", "Гарик", "Мартирасян");
        Person person3 = new Person ("3", "Дональд", "Трамп");
        Person person4 = new Person ("4", "Удот", "Удотович");
        Person person5 = new Person ("5", "Ярик", "Клемешев");
        group.addStudents(person1);
        group.addStudents(person2);
        group.addStudents(person3);
        group.addStudents(person4);
        group.addStudents(person5);

        print(group.getNameGroup());
        print("==========================");
        print("Дата старта последней недели: \n" + group.getLastDateOfStudies("12.08.2019"));
        print("==========================");
        group.listOfGroup();
        System.out.println(group.findStudent("Горб"));
        group.removeElement("5");
        group.listOfGroup();

    }
    private static void print(String str){
        System.out.println(str);
    }
}
