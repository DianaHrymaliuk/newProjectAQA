package lesson2;

public class Task9 {
    public static void main(String[] args) {
        task9(7, 3);
    }

    public static int[] task9(int len, int initialValue) {
        int arr[] = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}
// это проверка для себя
//    public static void task9(int len, int initialValue) {
//        int arr[] = new int[len];
//      for (int i = 0; i < arr.length; i++) {
//           arr[i] = initialValue;
//           System.out.print(arr[i]);
//       }
// }
//}
