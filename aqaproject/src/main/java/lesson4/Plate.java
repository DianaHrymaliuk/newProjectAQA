package lesson4;

public class Plate {
    public int food;
    public int c;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;
        } else {
            System.out.println("Добавте корм!");
        }
    }

    public void addFood(int c) {
        food += c;
        System.out.println("Добавлено " + c + " корма");
    }

    public void info() {
        System.out.println("Plate: " + food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }
}
