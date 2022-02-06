package lesson2;

public class Task5 {
    public static void task5(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
                System.out.print(arr[i]);
            } else {
                arr[i] = 1;
                System.out.print(arr[i]);
            }
        }
    }
}
