import java.util.Arrays;

public class lc3741 {
    public static void main(String[] args) {
        int[] num= {1,2,1,1,3};
    int res=mindis(num);
        System.out.println(res);
    }
    static int mindis(int[] nums){
        int [] first= new int[nums.length+1];
        int [] second= new int[nums.length+1];
        Arrays.fill(first,-1);
        Arrays.fill(second,-1);
        int min=Integer.MAX_VALUE;
        for(int i =0;i<nums.length;i++){
            if(first[nums[i]]==-1){
                first[nums[i]]=i;
            }
            else if(second[nums[i]]==-1){
                second[nums[i]]=i;
            }
            else{
                min= 2*(i-first[nums[i]]);
                first[nums[i]]=second[nums[i]];
                second[nums[i]]=i;
            }
        }
        return min;


    }
}
