package kyu8;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MultiplyTests {

    @Test
    void testMultiply() {
        assertEquals(6.0, Multiply.multiply(2.0, 3.0));
        assertEquals(0.02, Multiply.multiply(0.1, 0.2));
        assertEquals(-4.0, Multiply.multiply(2.0, -2.0));
    }
}
