import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.ls.qa.school.core.Point;

public class PointTest {

    @Test
    public void positiveTest ( ) {
        Point point1 = new Point(3, 3);
        Point point2 = new Point(5,5);

        double distance = point1.distance(point2);
        Assertions.assertEquals(2.8284271247461903, distance);
    }
    public void negativeTest ( ) {
        Point point1 = new Point(-3, -3);
        Point point2 = new Point(-5,-5);

        double negdistance = point1.distance(point2);
        Assertions.assertEquals(5.0, negdistance);
    }

}
