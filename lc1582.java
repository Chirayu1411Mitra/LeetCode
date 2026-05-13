public class lc1582 {
    public static void main(String[] args) {
        int[][]mat={{0,0,1,0},{0,0,0,0},{0,0,0,0},{0,1,0,0}};
        special(mat);

    }
    static  void special(int[][] mat){
        int count =0;
        int[] rowsum=new int[mat.length];
        int[] colsum=new int[mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                rowsum[i]+=mat[i][j];
                colsum[i]+=mat[j][i];
            }
            }
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j]==1 && rowsum[i]==1 && colsum[j]==1){
                    count++;
                }
            }
        }
        System.out.println(count);
        }

    }

