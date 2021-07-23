public class reverseInteger {
    private int temp = 0;
    public int reverse(int x) {
        int curr = x;
        for(int i = String.valueOf(x).length(); i > 0; i--) {
            int pop = curr % 10;
            curr = curr / 10;
            temp = temp * 10 + pop;
            System.out.print(temp);
        }
        return temp;
    }
}
