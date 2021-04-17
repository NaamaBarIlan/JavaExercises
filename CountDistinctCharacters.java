import java.util.HashMap;
import java.util.Map;

/**
 * Problem Domain: 
 * 
 * Implement the countDistinctCharacters method to return the number of distinct
 * characters in a String. Strings are all lowercase.
 * 
 * Examples:
 * 
 * countDistinctCharacters("abracadabra") returns 5
 * countDistinctCharacters("abracadabra1") returns 6
 * 
 * 1. Create a hashmap for key-value pairs: char and frequency number
 * 2. For loop over the string, at each char:
 *      -If the hashmap contains the char/key, increament the value
 *      -Else add the char to the hashmap and set the value to 1
 * 3. Iterate the hashmap, and count the number of key/value pairs where the value == 1
 * 4. Count the size of the map and output the result
 */

public class CountDistinctCharacters {
    
    public static void main(String[] args) {
        System.out.println("The number of distinct Characters is: " + countDistinctCharacters("abracadabra"));
    }

    public static int countDistinctCharacters(String inputString) {
        Map<Character, Integer> allCharMap = new HashMap<>();

        for (int i = 0; i < inputString.length(); i++) {
            char key = inputString.charAt(i);
            Integer value = allCharMap.get(key);
            boolean hasKey = allCharMap.containsKey(key);

            if(hasKey) {
                allCharMap.replace(key, value, ++value);
            } else {
                allCharMap.put(inputString.charAt(i), 1);
            }
        }

        int output = allCharMap.size();

        return output;
	}
}
