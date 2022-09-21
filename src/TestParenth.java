import junit.framework.*;

public class TestParenth extends TestCase{

    protected String test1 = "Hi, I ( want ) to test ( this";
    protected String test2 = "Hi, I want to test this";
    protected String test3 = "Hi, I ) want () to test ( this";
    protected String test4 = "Hi, I ( want ) to test this";

    public void testIterative(){
        boolean result = BalanceParenth.balanceParenthesesIterative(test1);
        boolean result1 = BalanceParenth.balanceParenthesesIterative(test2);
        boolean result2 = BalanceParenth.balanceParenthesesIterative(test3);
        boolean result3 = BalanceParenth.balanceParenthesesIterative(test4);
        assertEquals(false, result);
        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(true, result3);
    }

    public void testRecursive(){
        boolean result = BalanceParenth.balanceParenthesesRecursive(test1);
        boolean result1 = BalanceParenth.balanceParenthesesRecursive(test2);
        boolean result2 = BalanceParenth.balanceParenthesesRecursive(test3);
        boolean result3 = BalanceParenth.balanceParenthesesRecursive(test4);
        assertEquals(false, result);
        assertEquals(true, result1);
        assertEquals(false, result2);
        assertEquals(true, result3);
    }

}
