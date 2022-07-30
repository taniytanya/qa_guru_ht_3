package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertFalse(21 < 11);
    }

    @Test
    void secondTest() {
        Assertions.assertTrue(21 <= 21);
    }
}
