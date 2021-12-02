package lesson5_homework;

import java.math.BigInteger;

public class Employee {
    private String fullName, position, email,contactNumber;
    private int salary, age;

    public Employee(String fullName, String position, String email, String contactNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.contactNumber = contactNumber;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void getInfo() {
        System.out.printf("Full name: %s\nPosition: %s\nE-mail: %s\nContact Number: %s\nSalary: %d\nAge: %d\n",
                fullName, position, email, contactNumber, salary, age);
    }

}
