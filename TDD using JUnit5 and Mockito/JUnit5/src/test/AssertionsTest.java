import static org.junit.Assert.*;
import org.junit.Test;

public class AssertionsTest {

    @Test
    public void testAssertions() {

        assertEquals(5, 2 + 3);

        assertTrue(8 > 3);

        assertFalse(2 > 7);

        assertNull(null);

        assertNotNull(new Object());
    }
}