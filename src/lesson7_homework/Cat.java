package lesson7_homework;

public class Cat {
    private String name;
    private final int DEFAULT_APPETITE;
    private boolean fullness;

    public Cat(String name, int DEFAULT_APPETITE) {
        this.name = name;
        this.DEFAULT_APPETITE = DEFAULT_APPETITE;
        this.fullness = false;
    }

    public void eat(Plate plate) {
        if (plate.getFood() >= DEFAULT_APPETITE) {
            System.out.println("Кот " + name + " поел");
            plate.decreaseFood(DEFAULT_APPETITE);
            fullness = true;
        } else {
            fullness = false;
            System.out.println("В тарелке не хватает еды для кота " + name);
        }
    }

    public String getName() {
        return name;
    }

    public boolean isFullness() {
        return fullness;
    }

    public void printIsFullness() {
        if (fullness) {
            System.out.println("Кот " + name + " стал сытым");
        } else {
            System.out.println("Кот " + name + " остался голодным");
        }
    }
}
