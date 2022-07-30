package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest() {
        Assertions.assertFalse(13 <= 1);
    }

    @Test
    void secondTest() {
        Assertions.assertFalse(13 <= 2);
    }
}
