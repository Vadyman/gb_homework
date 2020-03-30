package lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println(this);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void putFood (int foodUnit) {
        food = food + foodUnit;
    }

    public boolean decreaseFood(int foodUnits) {
        if (this.food < foodUnits) {
            System.out.println("Необходимо добавить еды в миску, котику не хватает еды!");
            return false;
        }
        if (foodUnits < 0 ) {
            System.out.println("Указано отрицательное число еды, которое может съесть кот");
            return false;
        }
        food = food - foodUnits;
        return true;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "food=" + food +
                '}';
    }
}
