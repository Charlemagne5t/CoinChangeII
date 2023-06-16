import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void changeTest1() {
        int[] coins = {1, 2, 5};
        int amount = 5;
        int output = 4;
        Assert.assertEquals(output, new Solution().change(amount, coins));
    }

    @Test
    public void changeTest2() {
        int[] coins = {2};
        int amount = 3;
        int output = 0;
        Assert.assertEquals(output, new Solution().change(amount, coins));
    }

    @Test
    public void changeTest3() {
        int[] coins = {10};
        int amount = 10;
        int output = 1;
        Assert.assertEquals(output, new Solution().change(amount, coins));
    }
}
