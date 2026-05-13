import java.util.ArrayList;
import java.util.Arrays;

public class lc2033 {
    public static void main(String[] args) {
    int [][]grid={{1,2},{3,4}};
    int min= minops(grid,2);
        System.out.println(min);

    }
    static int minops(int [][] grid, int x){
        int m = grid.length;
        int n = grid[0].length;
        int rem=grid[0][0]%x;
       // int[] arr= new int[m*n];
        ArrayList<Integer> list= new ArrayList<>();
        for(int i =0;i<m;i++){
            for(int j=0;j<n;j++){
                list.add(grid[i][j]);
                if(grid[i][j]%x!=rem) return -1;
            }
        }
        Integer[] arr= new Integer[list.size()];
        arr=list.toArray(arr);
        Arrays.sort(arr);
        int mid=arr[arr.length/2];
        int minops=0;
        for(int i =0;i<arr.length;i++){
            minops+=Math.abs(mid-arr[i])/x;
        }
        return minops;
    }
}
