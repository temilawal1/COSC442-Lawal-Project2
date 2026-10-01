import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    private Fibonacci fibonacci;

    @BeforeEach
    void setUp() {
        fibonacci = new Fibonacci();
    }
    // before each test, declare a new fibonacci

    @AfterEach
    void tearDown() {
        fibonacci = null;
    }
    // after each test, set fibonacci to null to clear the test

    @Test
    /**
     * Runs various equality tests against the Fibonacci class
     */
    public void testFibonacci() {

        assertEquals(0, fibonacci.fibonacci(0));
        // failed assertion: expected = 0 actual = 1
        // junit failure message: Expected was [0] but was [1]
        assertEquals(1, fibonacci.fibonacci(1));
        assertEquals(1, fibonacci.fibonacci(2));
        assertEquals(2, fibonacci.fibonacci(3));
        assertEquals(3, fibonacci.fibonacci(4));
        assertEquals(5, fibonacci.fibonacci(5));
        assertEquals(8, fibonacci.fibonacci(6));
    }
}
