package lesson6;

public class Animal {
    private String name;
    private int age;
    private String color;
    private int weight;
    private int maxRangeRun;
    private int maxRangeSwim;
    private double maxHeightJump;

    public boolean run(int range) {
        System.out.println(name + " run: " + (range <= maxRangeRun));
        return range < maxRangeRun;
    }

    public boolean swim(int range) {
        System.out.println(name + " swim: " + (range < maxRangeSwim));
        return range < maxRangeSwim;
    }

    public boolean jumpOverObstacle(double height) {
        System.out.println(name + " jump: " + (height <= maxHeightJump));
        return height < maxHeightJump;
    }

    public Animal(String name, int age, String color, int weight, int maxRangeRun, int maxRangeSwim, double maxHeightJump) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.weight = weight;
        this.maxRangeRun = maxRangeRun;
        this.maxRangeSwim = maxRangeSwim;
        this.maxHeightJump = maxHeightJump;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxRangeRun() {
        return maxRangeRun;
    }

    public void setMaxRangeRun(int maxRangeRun) {
        this.maxRangeRun = maxRangeRun;
    }

    public int getMaxRangeSwim() {
        return maxRangeSwim;
    }

    public void setMaxRangeSwim(int maxRangeSwim) {
        this.maxRangeSwim = maxRangeSwim;
    }

    public double getMaxHeightJump() {
        return maxHeightJump;
    }

    public void setMaxHeightJump(double maxHeightJump) {
        this.maxHeightJump = maxHeightJump;
    }
}
