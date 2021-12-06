package lesson6_homework.animals;

public class Animal {
    protected String name, color;
    protected int age;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    public static int count = 0;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
        count++;
    }

    public void showAnimalCount() {
        System.out.println("Количество созданных животных - " + count);
    }

    public void run(int distance) {
        if (distance > 0 && distance <= maxRunDistance) {
            System.out.println("Животное по имени " + name + "пробежало " + distance + " метров.");
        } else {
            System.out.println("Неверное значение. Максимальная дистанция - " + maxRunDistance);
        }
    }

    public void swim(int distance) {
        if (distance > 0 && distance <= maxSwimDistance) {
            System.out.println("Животное по имени " + name + "проплыло " + distance + " метров.");
        } else {
            System.out.println("Неверное значение. Максимальная дистанция - " + maxSwimDistance);
        }
    }
}
