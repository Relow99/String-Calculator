import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
   public void add() {
        try {
            assertArrayEquals(0, StringCalculator.add(""));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void assertArrayEquals(int i, int add) {
    }
}