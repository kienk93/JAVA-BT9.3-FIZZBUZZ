package FIzzBuzz;

public class FizzBuzz {

    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = "FizzBuzz";

    public String FizzBuzz(int num) {
        boolean isDivitionBy3And5 = ((num % 3 == 0) && (num % 5 == 0));
        boolean isDivitionBy3 = num % 3 == 0;
        boolean isDivitionBy5 = num % 5 == 0;
        if (isDivitionBy3And5) return FIZZ_BUZZ;
        else if (isDivitionBy5) return BUZZ;
        else if (isDivitionBy3) return FIZZ;
        else return "" + num;
    }

}