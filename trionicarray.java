public class trionicarray {
    public static void main(String[] args) {
    int[] arr={2,1,3};
    boolean t= tri(arr);
        System.out.println(t);
    }
    static boolean tri(int[] nums){
        boolean p1=false;
        boolean p2=false;
        boolean p3=true;
        int temp1=0;
        int temp2=0;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                p1=true;
                temp1=i+1;
                break;

            }
        }
        for(int i =temp1;i<nums.length;i++){
            if(nums[i]<nums[i+1]){
                p2=true;
                temp2=i+1;
                break;
            }
        }
        for(int i =temp2;i<nums.length;i++){
            if(nums[i]>nums[i]){
                p3=false;
                break;
            }
        }
        return p1&&p2&&p3;
    }
}
