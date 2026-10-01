import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


// test class for point
public class PointTest {
    Point p1, p2;

    @BeforeEach
    public void setUp() throws Exception {
        p1 = new Point(5.0, 10.0);
        p2 = new Point(-10.0, 0.0);
        
    }

    @AfterEach
    public void tearDown() {
        p1 = null;
        p2 = null;
    }

    @Test
    public void testPointValues() {
        assertEquals(5.0, p1.x, 0.001);
        assertEquals(-10.0, p2.x, 0.001);

        assertEquals(10.0, p1.y, 0.001);
        assertEquals(.0, p2.y, 0.001);
    }

    
}
