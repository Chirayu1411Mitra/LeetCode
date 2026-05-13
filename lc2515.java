public class lc2515 {
    public static void main(String[] args) {
            String[] num={"a","b","leetcode"};
            int res= closest(num,"leetcode",0);
        System.out.println(res);
    }
    static int closest(String [] nums, String target, int startindex){
        int right=startindex;
        int p1=0;
        int p2=0;
        boolean found=false;
        int min=Integer.MAX_VALUE;
        while(p2<nums.length){
            if(nums[right].equals(target)) {
                p1=nums.length-p2;
                min=Math.min(min,Math.min(p1,p2));
                found=true;
            }
            right++;
            if(right>nums.length-1){
                right= 0;}
            p2++;
        }

        if(found) return min;
        return -1;

    }
}
