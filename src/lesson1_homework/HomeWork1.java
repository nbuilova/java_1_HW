package lesson1_homework;

public class HomeWork1{
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign(-15,20);
        printColor(37);
        compareNumbers(10,20);
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign(int a, int b){
        if (a + b >= 0){
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value){
        if (value <= 0){
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100){
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(int a, int b){
        if (a >= b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
