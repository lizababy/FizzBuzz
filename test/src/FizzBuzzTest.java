import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by lizalinto on 1/28/16.
 */
public class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @Before
    public void setUp(){
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void whenFizzBuzzIsPassedANumberItReturnsString(){
       assertEquals("1",fizzBuzz.fizzBuzz(1));
        assertEquals("1",fizzBuzz.fizzBuzz(1000));

    }
    @Test
    public void whenFizzBuzzIsPassedMultipleOfThreeReturnsFizz(){
        assertEquals("Fizz",fizzBuzz.fizzBuzz(3));
        assertEquals("Fizz",fizzBuzz.fizzBuzz(6));

    }
    @Test
    public void whenFizzBuzzIsPassedMultipleOfFiveReturnsFizz(){
        assertEquals("Buzz",fizzBuzz.fizzBuzz(5));

    }
    @Test
    public void whenFizzBuzzIsPassedMultipleOfTreeAndFiveReturnsFizzBuzz(){
        assertEquals("FizzBuzz",fizzBuzz.fizzBuzz(15));
        assertEquals("FizzBuzz",fizzBuzz.fizzBuzz(20));

    }


}
