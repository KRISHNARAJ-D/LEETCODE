import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}

public class Main_212222240002{
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Test cases
        int[][] testCases = {
            {1, 2, 3},  
            {9, 9, 9},  
            {0},        
            {4, 5, 9}   
        };

        for (int[] testCase : testCases) {
            System.out.println("Input: " + Arrays.toString(testCase));
            int[] result = solution.plusOne(testCase);
            System.out.println("Output: " + Arrays.toString(result));
            System.out.println();
        }
    }
}
