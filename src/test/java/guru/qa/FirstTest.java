package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstTest {
    @Test
    void firstTest(){
<<<<<<<<< Temporary merge branch 1
        Assertions.assertFalse(13<1);
    }
    @Test
    void secondTest(){
        Assertions.assertFalse(13<2);
=========

        Assertions.assertFalse(3<2);
    }
    @Test
    void secondTest(){
        Assertions.assertFalse(4<=1);
>>>>>>>>> Temporary merge branch 2
    }

}
