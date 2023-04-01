package org.example.homework;

import java.util.Objects;

//Создать класс Person.
//        У класса должны быть поля:
//        1. Имя (String)
//        2. Фамилия (String)
//        3. Возраст (продумать тип)
//        4. Пол
//        5*. Придумать свои собственные поля
//
//        Для этого класса
//        1. Реализовать методы toString, equals и hashCode.
//        2*. Придумать собственные методы и реализовать их
//
//        В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
public class HomeWork6 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Anton", "Gromov", 25, "male", "software developer"),
                new Person("Mikhail", "Borzov", 21, "male", null),
                new Person("Anna", "Petrova", 30, "female", "project manager"),
                new Person("Alice", "Ivanova", 19, "female", null),
                new Person("Dimitriy", "Petrov", 33, "male", "engineer")
        };

        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person.getName() + " " + person.getSurname());
            }
        }
    }
}
class Person {
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String occupation;
    public Person(String name, String surname, int age, String gender, String occupation) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.occupation = occupation;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getOccupation() {
        return occupation;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname) &&
                Objects.equals(gender, person.gender) &&
                Objects.equals(occupation, person.occupation);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender, occupation);
    }

    public void introduce() {
        System.out.println("Hello, my name is " + name + " " + surname + ".");
    }

    public boolean isEmployed() {
        return occupation != null;
    }

    public void celebrateBirthday() {
        age++;
        System.out.println("It's my birthday! Now I am " + age + " years old.");
    }
}
