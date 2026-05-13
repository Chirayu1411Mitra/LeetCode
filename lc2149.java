public class lc2149 {
    public static void main(String[] args) {
    int[] res= {3,1,-2,-5,2,-4};
    int[] t=rearrangeArray(res);
    for(int num:t){
        System.out.println(num);
    }
    }
    static int[] rearrangeArray(int[] nums){
     int [] res= new int[nums.length];
     int a=0;
     int b=1;
     for(int num : nums){
         if(num>0){
             res[a]=num;
             a+=2;
         }
         else{
             res[b]=num;
             b+=2;
         }
     }
     return res;
    }

}
