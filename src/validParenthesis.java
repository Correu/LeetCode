import java.util.Stack;

public class validParenthesis {
    public static boolean validParenthesis(String s) {
        Stack<String> paren = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                paren.push(String.valueOf(s.charAt(i)));
        }
        return true;
    }

    public static void main(String[] args) {
        String one = "()";
        String two = "({)}";
        String three = "({})";

        System.out.println(validParenthesis(one));
    }
}
