import java.util.HashMap;
import java.util.Map;


public class CountingCharacters {
    public static void main(String[] args) {

        String phrase = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with." +
                " So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> letterCounts = new HashMap<>();

        char[] charArray = phrase.toCharArray();

        for (int i = 0; i < charArray.length; i++ ) {
            letterCounts.put(charArray[i], letterCounts.getOrDefault(charArray[i], 0) +1);
        }

        for (Map.Entry<Character, Integer> letter : letterCounts.entrySet()) {
            System.out.println(letter.getKey() + " :" + letter.getValue());
        }

    }
}
