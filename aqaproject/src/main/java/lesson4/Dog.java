package lesson4;

public class Dog extends Animal {
    public void run(int a) {
        if (a <= 500 && a > 0)
            System.out.println("Животное пробежало " + a + " м.");
    }

    public static void swim(int b) {
        if (b <= 500 && b > 0)
            System.out.println("Животное проплыло " + b + " м.");
    }
}
