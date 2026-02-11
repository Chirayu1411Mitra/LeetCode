import java.util.*;
public class produxtofarray {
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        // Step 1: Calculate Prefix products
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }

        // Step 2: Calculate Suffix products on the fly and multiply
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            res[i] = res[i] * suffix;
            suffix *= nums[i];
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums= {1,2,3,4};
       int[] temp = productExceptSelf(nums);
       for(int i : temp){
           System.out.println(i);
       }
    }
}
