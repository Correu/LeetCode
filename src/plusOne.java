/*
    Problem 66
 */
public class plusOne {
    public static int[] plusOne(int[] digits) {
        if(digits[digits.length-1] == 9) {
            digits[digits.length-1] = 0;
            digits[digits.length-2] = digits[digits.length-2] + 1;
        } else {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
        }
        for(int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] dig1 = {1, 2, 3};
        int[] dig2 = {4, 3, 2, 1};
        int[] dig3 = {0};
        int[] dig4 = {1, 2, 9};

        plusOne(dig1);
        System.out.println();
        plusOne(dig2);
        System.out.println();
        plusOne(dig3);
        System.out.println();
        plusOne(dig4);
    }
}
