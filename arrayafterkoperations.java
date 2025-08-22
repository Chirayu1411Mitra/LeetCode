public class arrayafterkoperations {
    static int[] getFinalState(int[] nums, int k, int multiplier) {
        int count=0;
        while(count<=k){
            int min=min(nums);
            nums[min]*=multiplier;
            count++;
        }
        return nums;
    }
    static int min(int[] num){
        int min = 0;
        for (int i=0; i < num.length; i++) {
            if (num[i] < num[min]) min = i;
        }
        return min;
    }

    public static void main(String[] args) {
        int[] num={1,2};
        int[] num2= getFinalState(num,3,4);
        for (int i = 0; i <  num2.length ; i++) {
            System.out.println(num2[i]);
        }
    }
}
