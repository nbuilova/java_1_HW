package lesson6_homework.animals;

public class Cat extends Animal {
    public static int count = 0;

    public Cat(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    public void showCatCount() {
        System.out.println("Количество созданных котов - " + count);
    }

    @Override
    public void run(int distance) {
        maxRunDistance = 200;
        if (distance <= maxRunDistance) {
            System.out.println("Кот " + name + " пробежал " + distance + " метров.");
        } else {
            System.out.println("Кот " + name + "может пробежать только " + maxRunDistance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        maxSwimDistance = 0;
        if (distance > maxSwimDistance) {
            System.out.println("Кот " + name + " плавать не умеет.");
        }
    }
}
