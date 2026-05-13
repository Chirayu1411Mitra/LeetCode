public class lc1680 {
    public static void main(String[] args) {
       int t= res(3);
        System.out.println(t);
    }
    static int res(int n){
//        System.out.println(Integer.toBinaryString(n));
//        int n1=n>>2;
//        System.out.println(n1);
//        System.out.println(Integer.toBinaryString(n1));
    int result=0;
    int length=0;
    int mod=1_000_000_007;

    for(int i =1;i<=n;i++){
        if((i & i-1) ==0){
            length++;
        }
        result=(result<<length | i) % mod;
    }
    return result;




    }
}
