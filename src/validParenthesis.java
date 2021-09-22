import java.util.Stack;

public class validParenthesis {
    public static boolean validParenthesis(String s) {
        Stack<String> paren = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            System.out.println(String.valueOf(s.charAt(i)));
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
                paren.push(String.valueOf(s.charAt(i)));
            else if(s.charAt(i) == ')' && paren.peek() == "(") {
                System.out.println(paren.peek());
                paren.pop();
                return true;
            }
            else if(s.charAt(i) == ']' && paren.peek() == "[") {
                System.out.println(paren.peek());
                paren.pop();
                return true;
            }
            else if(s.charAt(i) == '}' && paren.peek() == "{") {
                System.out.println(paren.peek());
                paren.pop();
                return true;
            }
            else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String one = "()";
        String two = "({)}";
        String three = "({})";

        System.out.println(validParenthesis(one));
        System.out.println(validParenthesis(two));
        System.out.println(validParenthesis(three));
    }
}
