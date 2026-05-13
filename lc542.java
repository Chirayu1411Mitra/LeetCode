public class lc542 {
    public static void main(String[] args) {
        int[][] mat={{0,0,0},{0,1,0},{1,1,1}};
        recur(mat,1,1);
    }


    static void recur(int[][] mat, int l, int r) {
        if (mat[l][r] == 0) {
            return ;
        }
       int left =0;
        for(int i =r;i>0;i--){
            if(mat[l][i]==0) break;
            left++;
        }
        int right =0;
        for(int i =r;i<mat[l].length;i++){
            if(mat[l][i]==0) break;
            right++;
        }
        int top =0;
        for(int i =l;i>0;i--){
            if(mat[i][r]==0) break;
            top++;
        }
        int bottom =0;
        for(int i =l;i<mat.length;i++){
            if(mat[i][r]==0) break;
            bottom++;
        }

        System.out.println(left);
        System.out.println(right);
        System.out.println(top);
        System.out.println(bottom);
    }
}
