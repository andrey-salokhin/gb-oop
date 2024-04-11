package ru.gb.family_list.human;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Human {

    public enum Gender {
        MALE, FEMALE;
    };

    private String name;
    private String surname;
    private Calendar dob, dod;
    private Human mother;
    private Human father;
    private final Gender gender;


    public Human(String name, String surname, Calendar dob, Gender gender, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.gender = gender;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, Calendar dob, Gender gender) {
        this(name, surname, dob, gender, null, null);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDob(Calendar dob) {
        this.dob = dob;
    }

    public void setDod(Calendar dod) {
        this.dod = dod;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        String dobString = sdf.format(dob.getTime());
        String dodString = (dod != null) ? sdf.format(dod.getTime()) : "Неизвестно";

        String motherName = (mother != null) ? mother.getName() : "Неизвестно";
        String fatherName = (father != null) ? father.getName() : "Неизвестно";

        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dob=" + dobString +
                ", dod=" + dodString +
                ", mother=" + motherName +
                ", father=" + fatherName +
                '}';
    }
}