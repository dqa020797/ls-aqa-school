import ru.ls.qa.school.core.OddTask;
import ru.ls.qa.school.core.Point;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class OddTaskTest {
    @Test
    public void testPositive() {
        assertTrue(OddTask.isOdd(5));
    }
    public void testZero() {
        assertFalse(OddTask.isOdd(0));
    }
    public void testNegative() {
        assertFalse(OddTask.isOdd(-1));
        assertFalse(OddTask.isOdd(-2));

    }
}

