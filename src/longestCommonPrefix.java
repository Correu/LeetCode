/*
    Problem 14
 */
public class longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String output = strs[0];
        for(int i = 0; i < strs.length; i++) {
            while(strs[i].indexOf(output) != 0) {
                output = output.substring(0, output.length() - 1);
                if(output.isEmpty()) return "";
            }
        }
        return output;
    }

    public void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
