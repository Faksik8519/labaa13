package org.example;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0);
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "Unknown", 0.0);
    }

    public void displayInfo() {
        System.out.println(this);
    }

    public void displayInfo(String format) {
        if ("short".equals(format)) {
            System.out.println(name + " " + surname);
        } else {
            displayInfo();
        }
    }

    public void displayInfo(int years) {
        System.out.println(name + " " + surname + " has " + years + " years of experience.");
    }

    public static String getTesterInfo(Tester tester) {
        return tester.name + " " + tester.surname + " - " + tester.englishLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getExperienceInYears() {
        return experienceInYears;
    }

    public void setExperienceInYears(int experienceInYears) {
        this.experienceInYears = experienceInYears;
    }

    public String getEnglishLevel() {
        return englishLevel;
    }

    public void setEnglishLevel(String englishLevel) {
        this.englishLevel = englishLevel;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        }

        @Override
        public String toString() {
            return "Tester{" +
                "name='" + name  +
                ", surname='" + surname +
                ", experienceInYears=" + experienceInYears +
                ", englishLevel='" + englishLevel +
                ", salary=" + salary +
                '}';
    }
}