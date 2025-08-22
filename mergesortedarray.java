public class mergesortedarray {
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int start=m;int start2=0;
        int end =nums1.length-1;
        while(start<=end){
            nums1[start] = nums2[start2];
            start++;
            start2++;
        }
    }

    public static void main(String[] args) {
        int[] num1={1,2,3,0,0,0};
        int[] num2={2,5,6};
        merge(num1,3,num2,3);
        for (int j : num1) {
            System.out.println(j);
        }
    }
}
