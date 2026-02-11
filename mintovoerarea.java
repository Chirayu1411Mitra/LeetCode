public class mintovoerarea {
    public static void main(String[] args) {
        int[][] mat= {{0,1,0},{1,0,1},{2,0,1}};
        int[][] trans=min(mat);
        for(int i =0;i<trans.length;i++){
            for(int j =0;j<trans[i].length;j++){
                System.out.print(trans[i][j]);
            }
            System.out.println();
        }
    }
    static int[][] min(int[][] mat){
        int[][] trans = new int[mat[0].length][mat.length];
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++) {
                trans[j][i] = mat[i][j];
            }
        }
        return trans;
    }
}

