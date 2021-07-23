public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("No Two Sum Solution");
    }

    public static void main(String[] args) {
        int[] testArray = {1, 3, 5, 7, 9};
        twoSum tSum = new twoSum();
        int[] returnedArray = tSum.twoSum(testArray, 8);
        for(int i = 0; i < returnedArray.length; i++) {
            System.out.println(testArray[returnedArray[i]] + " ");
        }
    }
}
