import java.util.ArrayList;
import java.util.Arrays;

public class zerosubarray {
    static long zeroFilledSubarray(int[] nums) {
       ArrayList<int[]> list = new ArrayList<>();
        long result = 0;
        for(int i =0;i<nums.length;i++){
            for(int j =i;j<nums.length;j++){
                int[] temp = Arrays.copyOfRange(nums,i,j+1);
                if(!list.contains(temp)){
                list.add(temp);
                    if(zero(temp)){
                        result++;
                    }
                }

            }
        }
        return result;
    }
    static boolean zero(int[] num){
        for(int  i =0;i<num.length;i++){
            if(num[i]!=0){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums={1,3,0,0,2,0,0,4};
        long result = zeroFilledSubarray(nums);
        System.out.println(result);
    }
}
