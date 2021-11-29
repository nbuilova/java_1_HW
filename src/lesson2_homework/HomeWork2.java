package lesson2_homework;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println(sum10to20(15,5));
        System.out.println(sum10to20(3,4));
        positiveOrNegative(-30);
        positiveOrNegative(0);
        positiveOrNegative(30);
        System.out.println(isNegative(-7));
        printLineNTimes("+++++",5);
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2200));
    }
    public static boolean sum10to20 (int a, int b){
        return (a+b >= 10 && a+b <= 20);
    }
    public static void positiveOrNegative(int a){
        if (a < 0){
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }
    }
    public static boolean isNegative (int n){
        return (n < 0);
    }
    public static void printLineNTimes(String line, int n){
        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }
    public static boolean isLeapYear(int year){
        return (year % 400 ==0) || (year % 100 != 0 && year % 4 == 0);
    }

}