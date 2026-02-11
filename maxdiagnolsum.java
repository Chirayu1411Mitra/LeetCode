public class maxdiagnolsum {
    static int areaOfMaxDiagonal(int[][] dimensions) {
        double diag=0;
        int area =0 ;
        for(int i =0;i<dimensions.length;i++){
            int l = dimensions[i][0];
            int b = dimensions[i][1];

            double temp=Math.sqrt(l*l+b*b);
            if(temp>diag){
                diag=temp;
                area = l*b;
            }
        }
        return area;


    }

    public static void main(String[] args) {
        int[][]  arr = {{9,3},{8,6}};
        int area = areaOfMaxDiagonal(arr);
        System.out.println(area);
    }
}
