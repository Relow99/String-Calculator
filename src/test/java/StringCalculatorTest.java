import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
   public void add() {
        assertArrayEquals(0, StringCalculator.add(""));
    }

    private void assertArrayEquals(int i, int add) {
    }
}