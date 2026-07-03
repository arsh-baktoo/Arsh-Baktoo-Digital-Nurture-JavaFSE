import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;

public class MyServiceTest {

    @Test
    public void testVerify() {

        ExternalApi api = mock(ExternalApi.class);

        MyService s = new MyService(api);

        s.fetchData();

        verify(api).getData();

    }

}