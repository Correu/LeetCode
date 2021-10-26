/*
    Problem 66
 */
public class plusOne {
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1; i >= 0; i--) {
            if(digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
            int[] fill = new int[len+1];
            fill[0] = 1;

        return fill;
    }

    public static void main(String[] args) {
        int[] dig1 = {1, 2, 3};
        int[] dig2 = {4, 3, 2, 1};
        int[] dig3 = {0};
        int[] dig4 = {1, 2, 9};
        int[] dig5 = {9};
        int[] dig6 = {9, 9};


        plusOne(dig1);
        plusOne(dig2);
        plusOne(dig3);
        plusOne(dig4);
        plusOne(dig5);
        plusOne(dig6);

        for(int i: dig1) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i: dig2) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i: dig3) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i: dig4) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i: dig5) {
            System.out.print(i + " ");
        }
        System.out.println();

        for(int i: dig6) {
            System.out.print(i + " ");
        }
    }
}
