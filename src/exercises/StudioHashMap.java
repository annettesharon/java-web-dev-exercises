package exercises;
import java.util.Map;
import java.util.HashMap;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class StudioHashMap {
    public static void main(String[] args) {
        String defaultText = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        String newDefault = defaultText.replaceAll("[^A-Za-z]", "");
        char[] charsInString = newDefault.toLowerCase().toCharArray();

//        Pattern mypattern = Pattern.compile(MYREGEX, Pattern.CASE_INSENSITIVE);
//        Matcher mymatcher= mypattern.matcher(defaultText);
//        System.out.println(mymatcher);

        HashMap<Character, Integer> charCount = new HashMap<>();
        for(char letter:charsInString) {
                if (charCount.containsKey(letter)) {
                    charCount.put(letter, charCount.get(letter) + 1);
                } else {
                    charCount.put(letter, 1);
                }
        }
        for(Map.Entry<Character,Integer>onchar:charCount.entrySet()){
            System.out.println(onchar.getKey()+" : "+onchar.getValue());
        }
    }
}
