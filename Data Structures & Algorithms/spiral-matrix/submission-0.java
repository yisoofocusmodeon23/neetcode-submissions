class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0, right = matrix[0].length - 1, top = 0, bottom = matrix.length - 1;
        int row, col;

        while (top <= bottom && left <= right) {
            row = top;
            col = left;
            while (col <= right) { // top row
                result.add(matrix[row][col]);
                col++;
            }
            top++;

            row = top;
            col = right; // right row
            while (row <= bottom) {
                result.add(matrix[row][col]);
                row++;
            }
            right--;

            row = bottom;
            col = right;
            if (top <= bottom) {
                while (col >= left) { // bottom row
                    result.add(matrix[row][col]);
                    col--;
                }
                bottom--;
            }

            row = bottom;
            col = left;
            if (left <= right) {
                while (row >= top) { // left column
                    result.add(matrix[row][col]);
                    row--;
                }
                left++;
            }
        }
        return result;
    }
}
