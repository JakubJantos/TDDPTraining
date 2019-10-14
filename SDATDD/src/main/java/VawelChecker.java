import java.util.Arrays;
import java.util.List;

public class VawelChecker {
    private static List<Character> vowels = Arrays.asList('a', 'e', 'o', 'y','i', 'u');

    public static boolean isVowel(char c){
        return vowels.contains(c);
    }
}
