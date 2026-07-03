import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest {

    Operations op;

    @Before
    public void setUp() {
        op = new Operations();
    }

    @After
    public void tearDown() {
        op = null;
    }

    @Test
    public void testSub() {

        int a = 20;
        int b = 8;

        int result = op.sub(a, b);

        assertEquals(12, result);
    }
}