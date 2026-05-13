public class lc1404 {
    public static void main(String[] args) {
        int r=res("1101");
        System.out.println(r);
    }
    static int res(String s){
        int t= Integer.parseInt(s,2);
        int count=0;
       while(t!=1){
           if(t%2==0) {
               t=t/2;
               count++;
           }
           else{
               t++;
               count++;
           }
       }
        return count;
    }
//    static int temp(int n,int count){
//        if(n==1) {
//            return count;
//        }
//        if(n%2==0) temp(n/2,count+1);
//        else{
//            temp(n+1,count+1);
//        }
//        return count;
//    }
}
