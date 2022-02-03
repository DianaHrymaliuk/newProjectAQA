package lesson1;

public class HomeWorkApp {
    public static void main(String [] args){
        printThreeWords();
        chackSumSign();
        printColor();
        compareNumbers();
    }
    public static void printThreeWords(){
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    public static void chackSumSign(){
        int a = -6;
        int b = 6;
        int c = a+b;
        if (c>=0){
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor() {
        int i = -20;
        if (i <= 0) {
            System.out.println("Красний");
        }
        else if (i >= 1 && i<=100) {
            System.out.println("Зелений");
        }
        else {
            System.out.println("Желтий");
        }
    }
    public static void compareNumbers() {
        int a = 20;
        int b = 20;
        if (a >= b) {
            System.out.println("a>=b");
        } else {
            System.out.println("a<b");
        }
    }
}
