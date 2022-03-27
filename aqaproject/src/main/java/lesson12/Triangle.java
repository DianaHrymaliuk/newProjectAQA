package lesson12;

public class Triangle {

    int a;
    int b;
    int c;
    public  Triangle (int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public static double sqr(Object o) {
        double s = 0;
        Triangle triangle = (Triangle) o;
        if (triangle.a <= 0 || triangle.b <= 0 || triangle.c <= 0) {
            System.out.println("Значения не могут быть отрицательними!!");
        } else {
            double p = (triangle.a + triangle.b + triangle.c) / 2.0;
            s = Math.sqrt((p * (p - triangle.a) * (p - triangle.b) * (p - triangle.c)));
            System.out.println( "Площадь треугольника равна "+ s + " cm");
        }
        return s;
    }

//    public static void main(String[] args) {
//        Triangle triangle1= new Triangle(12,11,13);
//        sqr(triangle1);
//    }
}
