import java.util.*;
class Solution {
    public int maximumCount(int[] nums) {
        int pos_count = 0;
        int neg_count = 0;
        
        for (int num : nums) {
            if (num > 0) {
                pos_count++;
            } else if (num < 0) {
                neg_count++;
            }
        }
        
        return Math.max(pos_count, neg_count);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int nums[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            nums[i] = scanner.nextInt();
        }
        
        Solution solution = new Solution();
        int result = solution.maximumCount(nums);
        System.out.println("Maximum count of either positive or negative numbers: " + result);
    }
}
