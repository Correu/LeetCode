/*
    Returns the positions of the values that add to equal the wanted target value.

    [1] start at the first position, adding the numbers following to it comparing it to the target value
    [2] if no solution, move to the next position and repeat the process
    [3] continue until a solution is found or throw an error that no solution was found.
 */
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
