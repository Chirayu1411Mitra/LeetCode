import java.util.ArrayList;
import java.util.Arrays;

public class lc1283 {
    public static void main(String[] args) {
        int[] nums={44,22,11,33,1};
  int res=smallestDivisor(nums,5);
       // int res=sum(nums,44);
        System.out.println(res);
    }
    static int smallestDivisor(int [] nums, int t){
        Arrays.sort(nums);
        int div=1;

        while(div<=nums[nums.length-1]){
            if(sum(nums,div)<=t){

                return div;
            }
            div++;
        }
        return 0;
    }
    static int sum (int[] num , int d){
        int sum=0;
        for(int i:num){
            sum+=Math.ceilDiv(i,d);
        }

        return sum;
    }
}
