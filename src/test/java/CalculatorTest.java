import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import tdd.Calculator;

public class CalculatorTest {

    @Test
    public void test() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.add(1, 2), 3);
    }

    @Test
    public void test2() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.subtract(3,2), 1);
    }

    @Test
    public void test3() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.multiply(2,3), 6);
    }

    @Test
    public void test4() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.divide(6,3), 2);
    }

    @Test
    public void test5() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.add("1,2,3"), 6);
    }

    @Test
    public void test6() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(calculator.add(new int[]{1,2,3}), 6);
    }
}
