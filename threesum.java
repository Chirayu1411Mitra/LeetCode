import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.StreamSupport;

public class threesum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = new ArrayList<>();
        result = threesum(nums);
        System.out.println(result);
    }

    static List<List<Integer>> threesum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 2; j < nums.length; j++) {


                if (nums[i] + nums[i + 1] + nums[j] == 0) {
                    List<Integer> R1 = new ArrayList<>();
                    R1.add(nums[i]);
                    R1.add(nums[i + 1]);
                    R1.add(nums[j]);
                    if (!result.contains(R1)) {
                        result.add(R1);
                    }
                }
            }
        }
        return result;
    }


}

//        for(int i =0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//                for(int k=j+1;k<nums.length;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                           List<Integer> R1=new ArrayList<>();
//                           R1.add(nums[i]);
//                           R1.add(nums[j]);
//                           R1.add(nums[k]);
//                           if(result.contains(R1)){
//                           result.add(R1);}
//
//
//                    }
//                }
//            }
//        }

