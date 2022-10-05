package lesson2;

public class Task8 {
    public static void main(String[] args) {
        int[][] arr = new int[6][6];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i > j) {
                    System.out.print(arr[i][i]);
                } else if (i < j) {
                    System.out.print(arr[i][i]);
                } else {
                    System.out.print("1");
                }
            }
            System.out.println();
        }
    }
}
