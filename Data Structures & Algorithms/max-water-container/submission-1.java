class Solution {
    public int maxArea(int[] heights) {
        int low = 0, high = heights.length - 1;
        int area, maxArea = 0;
        while (low < high) {
            int width = high - low;
            int container_height = Math.min(heights[low], heights[high]);
            area = width * container_height;
            maxArea = Math.max(maxArea, area);
            if (heights[low] < heights[high]) {
                low++;
            } else {
                high--;
            }
        }
        return maxArea;
    }
}
