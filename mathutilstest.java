import org.junit.Assert;
import org.junit.Test;

public class MathUtilsTest {
    @Test
    public void testAdd() {
        int result = MathUtils.add(5, 3);
        Assert.assertEquals(8, result);
    }

    @Test
    public void testSubtract() {
        int result = MathUtils.subtract(5, 3);
        Assert.assertEquals(2, result);
    }

    @Test
    public void testMultiply() {
        int result = MathUtils.multiply(5, 3);
        Assert.assertEquals(15, result);
    }

    @Test
    public void testDivide() {
        int result = MathUtils.divide(6, 3);
        Assert.assertEquals(2, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        MathUtils.divide(6, 0);
    }
}
