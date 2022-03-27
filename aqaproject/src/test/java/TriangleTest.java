import lesson12.Triangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TriangleTest {
    Triangle triangle = new Triangle(11, 12, 10);
    Triangle triangle2 = new Triangle(-10, 10, 13);
    Triangle triangle3 = new Triangle(13, 14, 12);

    @Test
    public void sum() {
        int s = (int) (Triangle.sqr(triangle) + Triangle.sqr(triangle3));
        int exp = 123;
        Assertions.assertEquals(exp, s);
    }

    @Test
    public void sqr1() {
        Assertions.assertTrue(Triangle.sqr(triangle2) > 0);
    }

    @Test
    public void sqr2() {
        Assertions.assertTrue(Triangle.sqr(triangle) > 0);
    }

    @Test
    public void not_null() {
        Assertions.assertNotNull(Triangle.sqr(triangle));
        Assertions.assertNotNull(Triangle.sqr(triangle3));
    }

    @Test
    public void tr_equals() {
        Assertions.assertEquals(Triangle.sqr(triangle), Triangle.sqr(triangle3));
    }

}
