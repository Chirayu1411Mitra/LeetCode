public class lc45 {
    public static void main(String[] args) {
        int[] arr= {2,3,1,1,4};
    }
    static int minjump(int[] arr){
        int max=0;
        int idx=0;
        int res=0;
        for(int i =0;i<arr.length;i++){
            max=Math.max(max,i+arr[i]);
            if(i==idx){
                res++;
                idx=max;
            }
            if(i>max) break;
        }
        return res;
    }
}
