import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimplecalculatorTest{
    @Test
    void mustBefour(){
    var calculator = new Simplecalculator();
    assertEquals( 4, calculator.add(2, 2));
    }

    @Test
    void mustBeNine(){
        var calculator = new Simplecalculator();
        assertEquals(9, calculator.add(5,4));
    }
}

