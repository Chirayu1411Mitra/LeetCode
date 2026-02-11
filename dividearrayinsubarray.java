public class dividearrayinsubarray {
    static int minimumCost(int[] nums) {
        int res=0;
        if(nums.length==3){
            return nums[0]+nums[1]+nums[2];
        }
        int start=nums[0];
        res+=start;
        int min =Integer.MAX_VALUE;
        int min2=min;
        for(int i =1;i<nums.length;i++){
            if(nums[i]<min){
                min2=min;
                min=nums[i];
            }
            else if(nums[i]<min2){
                min2=nums[i];
            }
        }
        return res+min+min2;
    }

    public static void main(String[] args) {
        int[] c = {10,3,1,1};
        int cost=minimumCost(c);
        System.out.println(cost);
    }
}
