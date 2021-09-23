import java.util.Stack;

public class validParenthesis {
    public static boolean validParenthesis(String s) {
        Stack<Character> paren = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char check = s.charAt(i);
            if(check == '(' || check == '{' || check == '[') {
                paren.push(check);
            }
            else if(paren.empty())
                return false;
            else if(check == ')' && paren.pop() != '(') {
                return false;
            }
            else if(check == ']' && paren.pop() != '[') {
                return false;
            }
            else if(s.charAt(i) == '}' && paren.pop() != '{') {
                return false;
            }
        }
        return paren.empty();
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
