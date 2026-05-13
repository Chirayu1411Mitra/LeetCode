import java.util.Map;
import java.util.Stack;

public class lc84 {
    public static void main(String[] args) {
        int[] heights={2,4};
        int res= largestRectangleArea(heights);
        System.out.println(res);
    }
    static int largestRectangleArea(int[] heights) {
        int max=0;
        Stack<Integer> st= new Stack<>();
        for(int i =0;i<heights.length;i++){
            int curr=heights[i];
            while(!st.isEmpty() && heights[st.peek()]>curr){
                int h=heights[st.pop()];
                int width=0;
                if(st.isEmpty()){
                    width=i;
                }
                else{
                    width=i-st.peek()-1;
                }
                int currA=h*width;
                max=Math.max(currA,max);
            }
            st.push(i);
        }
        return max;

    }


}
