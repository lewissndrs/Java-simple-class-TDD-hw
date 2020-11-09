import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {

    Calculator calc;

    @Before
    public void before() {
        calc = new Calculator();
    }

    @Test
    public void hasAdd() {
        assertEquals(3,calc.add(1,2));
    }

    @Test
    public void hasSubtract() {
        assertEquals(-1,calc.subtract(2,3));
    }

    @Test
    public void hasMultiply() {
        assertEquals(15,calc.multiply(5,3));
    }

    @Test
    public void hasDivide() {
        assertEquals(2.5,calc.divide(5.0,2.0),0.01);
    }

}
