import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(20));
    }

    public static List<String> fizzBuzz(int n) {		
		int number = 1;
		int upperBound = n;
		List<String> output = new ArrayList<>();

        while(number <= upperBound) {
            if(number%3 == 0 && number%5 == 0) {
                output.add("FizzBuzz");
            } else {
                if (number%3 == 0) {
                    output.add("Fizz");
                } else {
                    if (number%5 == 0) {
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
