import java.util.ArrayList;
import java.util.List;

/**
 * Problem Domain: 
 * 
 * Implement the FizzBuzz method that returns a String with the numbers from 1 to n.
 * 
 * However, for multiples of three print "Fizz" instead of the number and for the 
 * multiples of five print "Buzz".
 * 
 * For numbers which are multiples of both three and five print "FizzBuzz".
 * 
 * Example:
 * 
 * fizzBuzz(15) returns:
 * [1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Buzz, Fizz, 11, Buzz, 13, 14, FizzBuzz]
 */

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }

    public static List<String> fizzBuzz(int n) {		
		int number = 1;
		int upperBound = n;
		List<String> output = new ArrayList<>();

        while(number <= upperBound) {
            if(number % 3 == 0 && number % 5 == 0) {
                output.add("FizzBuzz");
            } else {
                if (number % 3 == 0) {
                    output.add("Fizz");
                } else {
                    if (number % 5 == 0) {
                        output.add("Buzz");
                    } else {
                        output.add(String.valueOf(number));
                    }
                }
            }
            ++number;
        }
		return output;
	}
}
