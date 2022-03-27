package lesson12;

public class Triangle {
    public static void sqr(int a, int b, int c) {
        double s;
        if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Значения не могут быть отрицательними!!");
        } else {
            double p = (a + b + c) / 2.0;
            s = Math.sqrt((p * (p - a) * (p - b) * (p - c)));
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        sqr(11,12,10);
    }
}
