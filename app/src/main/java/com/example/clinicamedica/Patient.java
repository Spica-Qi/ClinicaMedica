package com.example.clinicamedica;

public class Patient {

    private String name;
    private String age;
    private String birthDate;
    private String category;
    private String hour;
    private String day;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "Nome: " + name +
                "\nIdade: " + age +
                "\nData de Nascimento: " + birthDate +
                "\nEspecialidade: " + category +
                "\nHora da consulta: " + hour +
                "\nDia da consulta: " + day;
    }
}
