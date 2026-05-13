public class lc1551 {
    public static void main(String[] args) {
        int res= minops(6);
        System.out.println(res);


    }
    static int minops(int n ){
        int mid=n/2;
        int target=(2*mid)+1;
        return mid;
    }
}
