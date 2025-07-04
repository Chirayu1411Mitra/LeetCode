public class missing_number {
    static int missingNumber(int[] nums) {
        sort(nums);
        int n = nums.length-1;
        for(int i=0 ;i<nums.length-1;i++){
            if(nums[i+1]!=nums[i]+1){
                return nums[i]+1;
            }
        }
        return nums[n]+1;

    }
    static void sort(int[] nums) {
        int n = nums.length;

        for (int j = 0; j < n - 1; j++) {
            for (int i = 0; i < n - 1 - j; i++) {
                if (nums[i] > nums[i + 1]) {

                    int temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int [] nums={9,6,4,2,3,5,7,0,1};
        int missing_numbere= missingNumber(nums);
        System.out.println(missing_numbere);
    }
}
