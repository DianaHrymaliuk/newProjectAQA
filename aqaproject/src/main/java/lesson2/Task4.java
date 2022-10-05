package lesson2;

public class Task4 {
    public static void main(String[] args) {
        task4("Something", 4);
    }

    public static void task4(String a, int b) {
        for (int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    public static boolean task4_1(int a) {
        if ((a % 4 == 0 || a % 100 == 0) && a % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
// это проверка для себя
//public static void main(String [] args){
//     task4_1(100);
//  }
//  public static void task4_1(int a){
//    if( (a % 4==0 || a % 100 == 0) && a % 400 == 0){
//       System.out.println("V");;
//     } else {
//       System.out.println("NV");;
//    }
// }
//}
