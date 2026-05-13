public class containerwithmostwater {
    static int maxArea(int[] height) {
        int p1=0;
        int p2=height.length-1;
        int res =0;

        while(p1<p2){
            int small= Math.min(height[p1],height[p2]);
            res=Math.max(res,(p2-p1)*small);
            if(height[p1]>height[p2]) p2--;
            else p1++;
        }

        return res;
    }

    public static void main(String[] args) {
        int res=maxArea(new int[]{1,3,2,5,25,24,5});
        System.out.println(res);
    }
}
