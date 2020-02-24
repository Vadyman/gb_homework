package lesson6;

public class Dog extends Animal {
    public Dog(String name, int age, String color, int weight, int maxRangeRun, int maxRangeSwim, double maxHeightJump) {
        super(name, age, color, weight, maxRangeRun, maxRangeSwim, maxHeightJump);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
