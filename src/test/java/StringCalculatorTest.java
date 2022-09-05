import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    void given_1_returns_1() {
        assertEquals(1, new StringCalculator().add("1"));
    }

    @Test
    void given_2_returns_2() {
        assertEquals(2, new StringCalculator().add("2"));
    }

}