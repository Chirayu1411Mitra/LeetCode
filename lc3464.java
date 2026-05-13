public class lc3464 {
    public static void main(String[] args) {
            int[][] points={{0,0},{1,2},{2,0},{2,2},{2,1}};
         //   int res= nmaxDistance(2,points,4)
        nmaxDistance(2,points,4);
    }
    static void nmaxDistance(int side , int[][]points, int k){
       // if(points.length<k) return 0;
       // if(side/k<2) return 1;
        int[] arr=new int[points.length];
        for(int i =0;i< points.length;i++){
            if(points[i][0]==points[i][1]) arr[i]=points[i][0];
            else if(points[i][0]==side) arr[i]=side+points[i][1];
            else if(points[i][1]==side) arr[i]=2*side+(side-points[i][0]);
            else if(points[i][0]==0) arr[i]=3*side+(side-points[i][1]);
            }
        for(int i:arr){
            System.out.println(i);
        }

        }
//        static boolean valid(int k , int[] arr, int p){
//        int start=1;
//        int end=p/k;
//
//
//    }
}
