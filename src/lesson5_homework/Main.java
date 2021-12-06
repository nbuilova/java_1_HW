package lesson5_homework;

import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Vasya Pupkin","engineer","vasya_pupkin@mail.com",
                "+7(963)333-3300",3000,34);
        employee.getInfo();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Masha Ivanova","Designer","m.ivanova@mail.com",
                "+7(354)637-2820",2300,25);
        employees[1] = new Employee("Elon Musk","Magnat","elon.musk@mail.ru",
                "+7(243)648-3212",300000000,50);
        employees[2] = new Employee("Olga Kozlova","Accountant","o.kozlova@gmail.com",
                "+7(234)253-6423",4000,45);
        employees[3] = new Employee("James Gosling","Dr. Java","james.gosling@amazon.com",
                "+9(837)3838-2323",200000000,66);
        employees[4] = new Employee("Ivan Ivanov","System Administrator","i.ivanov@mail.ru",
                "+2(234)345-3233",4000,35);

        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() >= 40){
                employees[i].getInfo();
                System.out.println();
            }

        }



    }
}
