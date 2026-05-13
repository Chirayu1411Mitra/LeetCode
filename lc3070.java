public class lc3070 {
    static int countSubmatrices(int[][] grid, int k) {
        int count=0;
        int row=0;
        int col=0;
        int i=grid.length-1;
        int j = grid[0].length-1;
        for(int a =0;a<=i;a++){
            row+=grid[a][0];
        }
        for(int a =0;a<=j;a++){
            col+=grid[0][a];
        }
        if(row<k){
            count+=i+1;
        }
        if(col<k){
            count+=j;
        }
        while(row>k){
            row-=grid[i][0];
            i--;
            count--;
        }
        while(col>k){
            col-=grid[0][j];
            j--;
            count--;
        }
        System.out.println(col);
        System.out.println(row);
        return count;
    }

    public static void main(String[] args) {
        int[][] grid={{7,2,9},{1,5,0},{2,6,6}};
        int res=countSubmatrices(grid,20);
        System.out.println(res);
    }
}
