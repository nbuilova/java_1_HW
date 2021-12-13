package lesson6_homework;

import lesson6_homework.animals.Animal;
import lesson6_homework.animals.Cat;
import lesson6_homework.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Cat catBarsik = new Cat("Barsik","white",3);
        Cat catMursik = new Cat("Mursik","red",7);

        catBarsik.run(201);
        catMursik.swim(9);

        Dog dogRalph = new Dog("Ralph","white",12);
        Dog dogTuzik = new Dog("Tuzik", "black", 2);
        Dog dogMarta = new Dog("Marta","red",4);

        dogRalph.run(600);
        dogTuzik.swim(20);
        dogMarta.run(150);

        Animal cowLara = new Animal("Lara","white-black",3,20,10);
        cowLara.run(30);
        cowLara.swim(10);

        catBarsik.showAnimalCount();
        catMursik.showCatCount();
        dogRalph.showDogCount();
    }
}
