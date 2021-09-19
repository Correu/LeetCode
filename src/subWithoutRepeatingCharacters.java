import java.util.HashMap;
import java.util.Map;

/*
    find the length of the longest substring without repeating characters
 */
public class subWithoutRepeatingCharacters {
    //parses through the length of the string
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> word = new HashMap<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char currChar = s.charAt(i);
            if (word.containsKey(currChar)) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    //checks for repeat characters
    public boolean checkRepeats(String s, int x, int y) {
        return false;
    }

    public static void main(String[] args) {
        String blank = "";
        String one = "abcabcbb";
        String two = "pwwkew";
        String three = "bbbbbbb";
        System.out.println("abcabcbb\t" + lengthOfLongestSubstring(one));
        System.out.println("pwwkew\t" + lengthOfLongestSubstring(two));
        System.out.println("bbbbbbb\t" + lengthOfLongestSubstring(three));
        System.out.println("blank\t" + lengthOfLongestSubstring(blank));
    }
}
