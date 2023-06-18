import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    @Test
    public void testReverse() {
        String result = StringUtils.reverse("Hello");
        Assert.assertEquals("olleH", result);
    }
}
