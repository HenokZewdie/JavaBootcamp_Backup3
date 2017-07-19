import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class MathTest {
    Math math;
    @Before
    public void setUp() throws Exception {
        math = new Math(7.0, 10.0);
    }
    @Test
    public void testAdd() {
        Assert.assertEquals(0.7, math.add());
    }
}