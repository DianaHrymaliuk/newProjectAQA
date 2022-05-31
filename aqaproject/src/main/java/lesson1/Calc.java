package lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        char q = ' ';
        while (q != 'q') {
            Scanner br = new Scanner(System.in);
            System.out.println("Enter the first number:");
            int i1 = br.nextInt();
            System.out.println("Enter the second number:");
            int i3 = br.nextInt();
            System.out.println("Enter the operator: + - * /");
            char i2 = br.next().charAt(0);
            if (i2 == '+') {
                double s = i1 + i3;
                System.out.println(s);
            } else if (i2 == '-') {
                double s = i1 - i3;
                System.out.println(s);
            } else if (i2 == '*') {
                double s = i1 * i3;
                System.out.println(s);
            } else if (i2 == '/') {
                double s = i1 / i3;
                System.out.println(s);
            }
            System.out.println("To exit enter 'q' ");
            q = br.next().charAt(0);
        }
    }
}

