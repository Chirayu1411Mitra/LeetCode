public class diffindigitandelesum {
    public static void main(String[] args) {
        int[] nums={9,1,11};
        int diff=diff(nums);
        System.out.println(diff);
    }
    static int diff(int[] nums) {

        int elesum = 0;
        int digitsum = 0;
        for (int i = 0; i < nums.length; i++) {
            elesum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 10) {
                digitsum += nums[i];
            } else {
                int sum = sum(nums[i]);
                digitsum += sum;
            }
        }
        System.out.println("elesum :"+ elesum);
        System.out.println("digitsum : "+ digitsum);
        return elesum - digitsum;
    }
    static int sum(int n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n=n/10;
        }
        return sum;
    }
}
