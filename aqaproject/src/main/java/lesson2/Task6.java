package lesson2;

public class Task6 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int j = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = j;
            j += 1;
            System.out.print(arr[i] + " ");
        }
    }
}
