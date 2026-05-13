public class lc396 {
    static int maxRotateFunction(int[] nums) {
        int max=0;
        for(int i =0;i<nums.length;i++){
            int temp=0;
            for(int j=0;j<nums.length;j++){
                temp+=i*nums[j];
            }
            if(temp>max) max=temp;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr= {4,3,2,6};
        int res= maxRotateFunction(arr);
        System.out.println(res);
    }
}
