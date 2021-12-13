package lesson7_homework;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int amount) {
        if (amount > 0 && (food - amount) >= 0) {
            food -= amount;
        } else {
            System.out.println("Неверное значение");
        }
    }

    public void increaseFood(int amount) {
        if (amount > 0) {
            food += amount;
        } else {
            System.out.println("Неверное значение");
        }
    }

    public void printFood() {
        System.out.println("Осталось еды в тарелке: " + food);
    }
}
