package ie.atu.calc;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcTest{
    Calc myCalc;

    @Test
    public void testAdd()
    {
        myCalc = new Calc();
        assertEquals(40, myCalc.add(20,20));

    }




}
