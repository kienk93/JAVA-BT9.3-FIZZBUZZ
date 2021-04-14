import FIzzBuzz.FizzBuzz;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    @DisplayName("Fizz")
    void test1(){
        int num = 3;
        String expertResult = fizzBuzz.FIZZ;
        String actualResult = fizzBuzz.FizzBuzz(num);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("Buzz")
    void test2(){
        int num = 5;
        String expertResult = fizzBuzz.BUZZ;
        String actualResult = fizzBuzz.FizzBuzz(num);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("FizzBuzz")
    void test3(){
        int num = 15;
        String expertResult = fizzBuzz.FIZZ_BUZZ;
        String actualResult = fizzBuzz.FizzBuzz(num);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("num")
    void test4(){
        int num = 2;
        String expertResult = "2";
        String actualResult = fizzBuzz.FizzBuzz(num);
        assertEquals(expertResult,actualResult);
    }
    @Test
    @DisplayName("num2")
    void test5(){
        int num = 13;
        String expertResult = "13";
        String actualResult = fizzBuzz.FizzBuzz(num);
        assertEquals(expertResult,actualResult);
    }

}