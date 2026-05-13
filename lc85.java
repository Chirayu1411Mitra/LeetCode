import java.util.Stack;

public class lc85 {
    public int maximalRectangle(char[][] matrix) {
        int arr[] = new int[matrix.length];
        for(int i =0;i<matrix.length;i++){
            int temp=0;
            for(int j =0;i<matrix[0].length;j++){

                if(matrix[i][j]=='1') temp++;
                if(matrix[i][j]=='0') temp=0;
            }
            arr[i]=temp;
        }
        int res=max(arr);
        return res;
    }
    static int max(int[] heights){
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
