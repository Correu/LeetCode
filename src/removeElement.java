public class removeElement {
    public static int removeElement(int[] nums, int val) {
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] test = {1, 2, 3, 3, 2, 1};
        int[] test2 = {3, 2, 2, 3};
        int value = 3;
        System.out.println(removeElement.removeElement(test2, value) + " " + test2.length);
    }
}
