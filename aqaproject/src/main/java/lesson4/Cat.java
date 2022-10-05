package lesson4;

public class Cat extends Animal {
    private String name;
    public int appetite;
    public boolean fullnes;


    public Cat(String name, int appettite, boolean fullnes) {
        this.name = name;
        this.appetite = appettite;
        this.fullnes = fullnes;
    }


    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    public int getAppetite() {
        return appetite;
    }

    public void run(int a) {
        if (a <= 200 && a > 0)
            System.out.println("Животное пробежало " + a + " м.");
    }

    public static void swim(int b) {
        System.out.println("Сорри, но плавать я не умею");
    }
}
