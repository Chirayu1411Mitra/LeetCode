public class binaryGaps {
    static int binaryGap(int n) {
        int res=0;
        int count=0;
        while(n>=1){
            int temp=0;
            boolean t1=false;
            boolean t2=false;
            if(n%2==1 && !t1){
                t1=true;
                continue;
            }
            n=n/2;
        }
        return res;
    }

    public static void main(String[] args) {
        int res=binaryGap(22);
    }
}
