package ru.lesson.BankAcount;
/**
 * Created by Администратор on 11.01.2017.
 */
public class Person {
    private String firstName;
    private String lastName;
    int age;
    public Person(String lastName,String firstName,int age){
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }
    public void display(){
        System.out.println("Last name: "+ this.lastName);
        System.out.println("First name: "+ this.firstName);
        System.out.println("age: "+ this.age);
    }
    public String getLastName(){
        return this.lastName;
    }

}
