import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @ParameterizedTest
    @CsvSource({"1,1", "2,2", "3,3"})
    void given_a_string_number_returns_an_integer(String input, int output) {
        assertEquals(output, new StringCalculator().add(input));
    }

    @Test
    void empty_string_returns_0() {
        assertEquals(0, new StringCalculator().add(""));
    }

}