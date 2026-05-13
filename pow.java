public class pow {
    static double myPow(double x, int n) {
        long N=n;
        if(n<0){
            N=-N;
            x=1/x;
        }
        return temp(x,N);
    }
    static double temp(double x, long n){
        if(n==0) return 1;
        double a=temp(x,n/2);
        if(n%2==0) return a*a;
        else return a*a*x;
    }

    public static void main(String[] args) {
        double res=myPow(2.00000,-2);
        System.out.println(res);
    }
}
