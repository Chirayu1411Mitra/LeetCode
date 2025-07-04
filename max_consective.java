public class max_consective {
    static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int temp_count=0;
        for(int i=0;i<nums.length;i++){
    
            if(nums[i]==1) {
                temp_count++;
                count=Math.max(count,temp_count);
            }
            else{
                temp_count=0;
            }

        }


        return count;
    }

    public static void main(String[] args) {
        int[] nums={1,1,0,1,1,1};
       int max= findMaxConsecutiveOnes(nums);
        System.out.println(max);
    }
}
