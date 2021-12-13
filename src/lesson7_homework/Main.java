package lesson7_homework;

public class Main {
    public static void main(String[] args) {

        Plate plate = new Plate(55);

        Cat[] cats = new Cat[4];
        cats[0] = new Cat("Mursik", 30);
        cats[1] = new Cat("Barsik", 35);
        cats[2] = new Cat("Mila", 20);
        cats[3] = new Cat("James", 5);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].printIsFullness();
            plate.printFood();
        }

        plate.increaseFood(50);
        plate.printFood();
    }
}