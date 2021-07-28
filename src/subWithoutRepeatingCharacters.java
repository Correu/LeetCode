/*
    find the length of the longest substring without repeating characters
 */
public class subWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int charCount = 0;
        String temp = "";
        for(int i = 0; i < s.length()-1; i++) {
            System.out.println(s.charAt(i) + " " + s.charAt(i + 1));
            String currValue = "" + s.charAt(i);
            if(!temp.contains(currValue)) {
                temp += s.charAt(i);
                System.out.println(temp);
                charCount++;
            } else {
                break;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        String testString = "ababa";
        String test2 = "bbbbb";
        String s = "abcabcbb";
        String p = "pwwkew";
        System.out.println(lengthOfLongestSubstring(p));
    }
}
