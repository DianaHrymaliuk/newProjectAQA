package lesson5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arr = {"Hello", "and", "have", "a", "nice", "day"};
        System.out.println(Arrays.toString(arr));
        rearrange(arr, 1, 4);
        System.out.println(Arrays.toString(arr));

        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> box1 = new Box();
        Box<Apple> box2 = new Box();
        Box<Apple> box3 = new Box();
        Box<Apple> box4 = new Box(); // пустой для проверки

        for (int i = 0; i < 3; i++) {
            box1.addFruit(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            box2.addFruit(new Apple());
        }


        box3.addFruit(new Apple());
        box3.addFruit(new Apple());


        System.out.println("Weight of the Box1 " + box1.getWeight());
        System.out.println("Weight of the Box2 " + box2.getWeight());
        System.out.println("Weight of the Box3 " + box3.getWeight());

        System.out.println(box1.compare(box2));

//        box4.sprinkle(box3);
//        box1.sprinkle(box2);
//        box2.sprinkle(box3);

        System.out.println("Weight of the Box4 " + box4.getWeight());

    }

    public static <T> void rearrange(T[] arr, int a, int b) {
        T t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }
}

