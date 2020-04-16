package CleanCodeVarriable;

public class FizzBuzz {
    public static String fizzBuzz(int number){
        final boolean IS_FIT = number % 3 == 0;
        final boolean IS_BUZZ = number % 5 == 0;
        final boolean IS_FIT_BUZZ = number % 5 == 0 && number % 5 == 0;


        if(IS_FIT_BUZZ)
            return "FizzBuzz";

        if(IS_FIT)
            return "Fizz";

        if(IS_BUZZ)
            return "Buzz";

        return number + "";
    }
}

