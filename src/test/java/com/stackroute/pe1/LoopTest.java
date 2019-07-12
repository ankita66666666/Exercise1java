
import com.stackroute.pe1.Loop;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LoopTest {

    Loop loop;

    @Before
    public void setUp() throws Exception {
        loop = new Loop();
    }

    @After
    public void tearDown() throws Exception {
        loop = null;
    }

    @Test
    public void givenNStringAndNumberShouldReturnString() {
        String result = loop.repeat(3);
        assertEquals("122333", result);
    }
}