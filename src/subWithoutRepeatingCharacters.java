/*
    find the length of the longest substring without repeating characters
 */
public class subWithoutRepeatingCharacters {
    public static int lengthOfLongestSubstring(String s) {
        int charCount = 0;
        String temp = "";
        //if an empty string
        if(s.length() == 0) {
            return 0;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            temp += s.charAt(i);
            String test = temp;
            System.out.println(test);
            if (!temp.contains(test)) {
                charCount++;
            } else {
                break;
            }
        }

        return charCount;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        String p = "pwwkew";
        String b = "bbbbbbb";
        String blank = "";
        System.out.println("pwwkew\t" + lengthOfLongestSubstring(p));
        System.out.println("blank\t" + lengthOfLongestSubstring(blank));
    }
}
