import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {
    @Test
    void given_one_returns_one() {
        assertEquals(1, new StringCalculator().add("1"));
    }

}