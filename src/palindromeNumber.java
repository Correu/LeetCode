/*
    Problem 9
 */
public class palindromeNumber {
    public static boolean isPalindrome(int x) {
        int temp = x;
        int rev = 0;
        while(temp > 0) {
            int pop = temp % 10;
            rev = rev * 10 + pop;
            temp = temp / 10;
        }
        if(rev == x) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int one = 121;
        int no = 10;
        boolean result = palindromeNumber.isPalindrome(no);
        System.out.println(result);
    }
}
