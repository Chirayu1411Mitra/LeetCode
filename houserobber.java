import java.util.ArrayList;
import java.util.Arrays;

public class houserobber {
    static int rob(int[] nums) {
        int[] dp  =new int[nums.length];
        Arrays.fill(dp,-1);
        return check(0,dp,nums);

    }
    static int check(int n , int[] dp,int[] nums){
        if(n>nums.length-1) return 0;
        if(dp[n]!=-1) return dp[n];

        int curr= nums[n]+check(n+2,dp,nums);

        int skip= check(n+1,dp,nums);
        dp[n]=Math.max(curr,skip);
        return dp[n];

    }

    public static void main(String[] args) {
        int[] nums= {2,1,1,2};
        int result = rob(nums);
        System.out.println(result);
    }
}
