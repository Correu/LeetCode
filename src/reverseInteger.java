/*
    return the reverse of a given integer. 321 -> 123
 */
public class reverseInteger {
    private int temp = 0;
    public int reverse(int x) {
        int curr = x;
        while(x != 0) {
            int pop = curr % 10;
            curr = curr / 10;
            temp = temp * 10 + pop;
            System.out.print(temp);
        }
        return temp;
    }

    public static void main(String[] args) {
        reverseInteger revInt = new reverseInteger();
        int test = revInt.reverse(321);
        System.out.println(test);
    }
}
