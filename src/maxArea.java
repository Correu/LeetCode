public class maxArea {
    public int maxArea(int[] height) {
        int largest = 0;
        int second = 0;
        for(int i = 0; i < height.length; i++) {
            largest = height[i];
            for(int j = 1; j < height.length-1; j++) {
                if(height[j] > largest) {
                    largest = height[j];
                }
            }
            //int bestArea = largest *
        }
        return 0;
    }

    public void main(String[] args) {
        int[] one = {1, 1};
        int[] two = {4, 3, 2, 1, 4};
        int[] three = {1, 2, 1};
        maxArea(one);
        maxArea(two);
        maxArea(three);
    }
}
