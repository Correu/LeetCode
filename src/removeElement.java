public class removeElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val)
                continue;
            else
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 3, 2, 1};
        int value = 3;
        System.out.println(removeElement.removeElement(test, value));
    }
}
