/*
    find the length of the longest substring without repeating characters
 */
public class subWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int charCount = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) != s.charAt(i + 1) && (i+1) < s.length()) {
                charCount++;
            }
        }
        return charCount;
    }

    public static void main(String[] args) {
        String testString = "abcbcdcd";
        System.out.println(lengthOfLongestSubstring(testString));
        System.out.println("test");
    }
}
