package com.HomeWork.Hillel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Group {

    protected String nameCourse;
    protected String startOfClasses;
    protected int sumOfClasses;
    protected int numberClassesOnWeek;
    protected ArrayList<Person> studentsOfGroup = new ArrayList<>();


    public Group(String nameCourse, String startOfClasses, int sumOfClasses, int numberClassesOnWeek) {
        this.nameCourse = nameCourse;
        this.startOfClasses = startOfClasses;
        this.sumOfClasses = sumOfClasses;
        this.numberClassesOnWeek = numberClassesOnWeek;
    }

    public void addStudents(Person person) {
        this.studentsOfGroup.add(person);
    }

    public String getNameGroup() {
        return "Курс: " + nameCourse + " (" + startOfClasses + ").";
    }

    public String getLastDateOfStudies(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(dateFormat.parse(date));
        cal.add(Calendar.DATE, ((sumOfClasses / numberClassesOnWeek - 1) * 7));
        return dateFormat.format(cal.getTime());
    }

    public void listOfGroup() {
        for (Person person : studentsOfGroup) {
            System.out.println(person);
        }
    }

    public boolean findStudent(String lastNames) {
        boolean result = false;
        for (Person person : studentsOfGroup) {
            if (person.getLastOfStudent().equals(lastNames)) {
                return result = true;
            } else {
                result = false;
            }
        }
        return result;
    }
    public void removeElement(String removeElement){
        Iterator<Person> personIterator = studentsOfGroup.iterator();//создаем итератор
        while(personIterator.hasNext()) {//до тех пор, пока в списке есть элементы
            Person nextPerson = personIterator.next();//получаем следующий элемент
            if (nextPerson.getLastOfStudent().equals(removeElement)) {
                personIterator.remove();//удаляем ученика с нужным именем
            }else if (nextPerson.getStudentNumber().equals(removeElement)){
                personIterator.remove();
            }
        }
    }
}

