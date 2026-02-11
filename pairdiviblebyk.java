public class pairdiviblebyk {
    static boolean canArrange(int[] arr, int k) {
        int start=0;
        int end= arr.length-1;
        while(start<=end){
            if((arr[start]+arr[end])%k!=0){
                return false;
            }
            start++;
            end--;
        }
        return true;

    }

    public static void main(String[] args) {
        int[] arr={-1,1,-2,2,-3,3,-4,4};
        boolean result=canArrange(arr,3);
        System.out.println(result);
    }
}
