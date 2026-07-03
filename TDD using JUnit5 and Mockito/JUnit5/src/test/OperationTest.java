import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OperationTest {

    @Test
    public void testAdd() {

        Operations op = new Operations();

        int result = op.add(10, 5);

        assertEquals(15, result);
    }
}