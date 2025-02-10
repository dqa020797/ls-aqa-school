import org.junit.jupiter.api.Test;
import ru.ls.qa.school.core.OddTask;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OddTaskTest {
    @Test
    public void testPositive() {
        assertTrue(OddTask.isOdd(5));
    }

    @Test
    public void testZero() {
        assertFalse(OddTask.isOdd(0));
    }

    @Test
    public void testNegative() {
        assertTrue(OddTask.isOdd(-1));
        assertFalse(OddTask.isOdd(-2));

    }
}

