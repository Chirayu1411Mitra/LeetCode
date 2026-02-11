public class matrixsum {
    public static void main(String[] args) {
//    int[][] mat={{1,2,3},{-1,-2,-3},{1,2,3}};
        int[][] mat={{-1,0,-1},{-2,1,3},{-2,-2,-1}};
    long sum=sum(mat);
        System.out.println(sum);
    }
    static long sum(int[][] matrix){
        int sum= 0;
        int Ncount=0;
        int count=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j =0;j<matrix[i].length;j++){
                 sum+= Math.abs(matrix[i][j]);
                 count++;
                 if(matrix[i][j]<=0){
                     Ncount++;
                 }
                if(Math.abs(matrix[i][j])<min){
                    min=matrix[i][j];
                }
            }
        }
        if(Ncount%2==0){
            return (long) sum;
        }
        else{
            return (long) sum+min+min;
        }
    }
}
