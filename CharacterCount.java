import java.util.HashMap;
import java.util.Map;

/**
 * Implement the characterCount method to return the number of occurrences of each letter
 * in a String. Strings are all lowercase.
 * 
 * Examples:
 * 
 * characterCount("abracadabra") returns:
 * {"a":5, "b":2, "c":1, "d":1, "r":2}
 * 
 * characterCount("abracadabra1") returns:
 * {"a":5, "b":2, "c":1, "d":1, "r":2, "1":1}
 * 
 * 
 * 1. Instantiate a string builder for the method output
 * 2. Instantiate a hashmap for key-value pairs: char and frequency number
 * 3. For loop over the string, at each char:
 *      -If the hashmap contains the char/key, increament the value
 *      -Else add the char to the hashmap and set the value to 1
 * 4. Use a for each loop to iterate over each entry of the map and append 
 * its key and value to the the output string builder
 * 5. Return the output string builder
 */

public class CharacterCount {
    public static void main(String[] args) {
        System.out.println("The characterCount of abracadabra is: " 
        + CountCharacters("abracadabra"));

        System.out.println("The characterCount of abracadabra1 is: " 
        + CountCharacters("abracadabra1"));
    }

    public static StringBuilder CountCharacters(String inputString) {
        StringBuilder output = new StringBuilder();

        Map<Character, Integer> charCountMap = new HashMap<>();

        for(int i = 0; i < inputString.length(); i++) {
            char key = inputString.charAt(i);
            Integer value = charCountMap.get(key);
            boolean hasKey = charCountMap.containsKey(key);

            if(hasKey) {
                charCountMap.replace(key, value, ++value);
            } else {
                charCountMap.put(inputString.charAt(i), 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            output.append( "\"" + entry.getKey() + "\":" + entry.getValue() + ", ");
        }

        return output;
    }
}
