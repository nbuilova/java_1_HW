package lesson6_homework.animals;

public class Dog extends Animal{
    public static int count = 0;

    public Dog(String name, String color, int age) {
        super(name, color, age);
        count++;
    }

    public void showDogCount() {
        System.out.println("Количество созданных собак - " + count);
    }

    @Override
    public void run(int distance) {
        maxRunDistance = 500;
        if (distance <= maxRunDistance) {
            System.out.println("Собака " + name + " пробежала " + distance + " метров.");
        } else {
            System.out.println("Собака " + name + " может пробежать только " + maxRunDistance + " метров.");
        }
    }

    @Override
    public void swim(int distance) {
        maxSwimDistance = 10;
        if (distance <= maxSwimDistance) {
            System.out.println("Собака " + name + " проплыла "+ maxSwimDistance+" метров");
        }else {
            System.out.println("Собака " + name + " может проплыть только " + maxSwimDistance + " метров.");
        }
    }

}
