/*
    find the length of the longest substring without repeating characters
 */
public class subWithoutRepeatingCharacters {
    //parses through the length of the string
    public static int lengthOfLongestSubstring(String s) {
        System.out.println(s.length());
        int count = 0;
        String currSub = "";
        for(int i = 0; i < s.length(); i++) {
            String currChar = "" + s.charAt(i);
            currSub = currSub + currChar;
            System.out.println(currSub + " " + currChar);
            if(currSub.contains(currChar)) {
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
        String s = "abcabcbb";
        String p = "pwwkew";
        String b = "bbbbbbb";
        String blank = "";
        System.out.println("pwwkew\t" + lengthOfLongestSubstring(p));
        System.out.println("blank\t" + lengthOfLongestSubstring(blank));
    }
}
