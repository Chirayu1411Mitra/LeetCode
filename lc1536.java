public class lc1536 {
    public static void main(String[] args) {
        int [][] grid={{0,1,1,1,1,1,1,0},{0,0,1,1,1,1,0,0},{0,0,0,1,1,0,0,0},{0,0,0,0,1,0,0,0},{1,0,0,0,0,0,0,0},{1,1,0,0,0,0,0,0},{1,1,1,0,0,0,0,0},{1,1,1,1,0,0,0,0}};
        int res=minSwap(grid);
        System.out.println(res);
    }

    static int minSwap(int[][] grid) {
        int[] freq = new int[grid.length];
        for (int i = 0; i <= grid.length-1; i++) {
            int temp = 0;
            for(int j=grid[i].length-1; j >=0; j--) {
                if (grid[i][j] == 1) {
                    freq[i] = temp;
                    break;
                } else {
                    temp++;
                }
            }

        }
        int res=sort(freq);
        if(freq[0]<grid.length-2){
            return 0;
        }
        return res;
    }
    static int sort(int[] freq){
        int n = freq.length;
        int res = 0;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (freq[j] < freq[j + 1]) {
                    int temp = freq[j];
                    freq[j] = freq[j + 1];
                    freq[j + 1] = temp;
                    res++;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        return res;
    }
}
