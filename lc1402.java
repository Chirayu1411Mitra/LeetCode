import java.util.Arrays;

public class lc1402 {
    public static void main(String[] args) {
        int[] arr={-1,0,5,-8,-7};
        int res=maxSatisfaction(arr);
        System.out.println(res);
    }
    static int maxSatisfaction(int[] satisfaction) {
        Arrays.sort(satisfaction);

        int presum=0;
        int total=0;
        for(int i=satisfaction.length-1;i>=0;i--){
            presum+=satisfaction[i];
            if(presum<0) break;
            total+=presum;
        }
        return total;
    }
}
