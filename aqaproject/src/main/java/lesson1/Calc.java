package lesson1;


import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        char q = ' ';
        while (q != 'q') {
            double s;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int i1 = sc.nextInt();
            System.out.println("Enter the operator: + - * /");
            char i2 = sc.next().charAt(0);
            System.out.println("Enter the second number:");
            int i3 = sc.nextInt();
            switch (i2){
                case '+' :  s = i1 + i3;
                    break;
                case '-' :  s = i1 - i3;
                    break;
                case '/' :  s = i1 / i3;
                    break;
                case '*' :  s = i1 * i3;
                    break;
                default:
                    System.out.println("Error! Enter correct operator");
                    return;
            }
            System.out.println(s);

            System.out.println("To exit enter 'q' ");
            q = sc.next().charAt(0);
        }
    }
}

