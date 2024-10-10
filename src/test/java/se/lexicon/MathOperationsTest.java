package se.lexicon;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MathOperationsTest {


    @Test
    public void testSubtractReturn10(){
        int expected = 10;
        int actual = MathOperations.subtract(15,5); // 10
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSubtractInWrongWay(){
        Assertions.assertNotEquals(10, MathOperations.subtract(10,5));
    }

}
