import org.example.FizzBuzz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
public class Ex6Test {


        @Test
        public void testFizzBuzz() {
            // Test with divisible by both 3 and 5
            assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));

            // Test with divisible by 3
            assertEquals("Fizz", FizzBuzz.fizzBuzz(9));

            // Test with divisible by 5
            assertEquals("Buzz", FizzBuzz.fizzBuzz(20));

            // Test with not divisible by 3 or 5
            assertEquals("7", FizzBuzz.fizzBuzz(7));
        }

        @Test
        public void testFizzBuzzWithZero() {
            // Test with zero
            assertThrows(IllegalArgumentException.class, () -> {
                FizzBuzz.fizzBuzz(0);
            });
        }

        @Test
        public void testFizzBuzzWithNegativeNumber() {
            // Test with negative number
            assertThrows(IllegalArgumentException.class, () -> {
                FizzBuzz.fizzBuzz(-15);
            });
        }
    }


