import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void fizz() {
        assertEquals("fizz", FizzBuzz.fizzbuzz(3, ""));
    }

    @Test
    public void fuzz() {
        assertEquals("fuzz", FizzBuzz.fizzbuzz(5, ""));
    }

    @Test
    public void fizzfuzz() {
        assertEquals("fizzfuzz", FizzBuzz.fizzbuzz(15, ""));
    }

    @Test
    public void number() {
        assertEquals("11", FizzBuzz.fizzbuzz(11, ""));
    }
}