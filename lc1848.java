public class lc1848 {
    public static void main(String[] args) {
    int[] nums={5,3,6};
    int res=min(nums, 5,2);
        System.out.println(res);
    }
    static int min(int[] nums ,int target, int start){
        int p1=start;
        int p2=start;
        while(p1<nums.length || p2>=0){
            if(p1<nums.length && nums[p1]==target ){
                return p1-start;
            }
            if( p2>=0 && nums[p2]==target ){
                return p2-start;
            }
            p1++;
            p2--;
        }
        return -1;
    }
}
