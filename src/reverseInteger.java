public class reverseInteger {
    int temp = 0;
    public int reverse(int x) {
        int pop = x % 10;
        temp = temp * 10 + pop;
        return temp;
    }
}
