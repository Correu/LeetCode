/*
    Problem 14
 */
public class longestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String output = strs[0];
        for(int i = 0; i < strs.length; i++) {
            System.out.println(strs[i] + " " + i);
            while(strs[i].indexOf(output) != 0) {
                output = output.substring(0, output.length() - 1);
                System.out.println(output);
                System.out.println(strs[i].indexOf(output));
                if(output.isEmpty()) return "";
            }
        }
        return output;
    }

    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
