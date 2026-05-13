public class lc1758 {
    static int minOperations(String s){
        String s2 = s.startsWith("0") ? "1" + s.substring(1) : s.startsWith("1") ? "0" + s.substring(1) : s;
     return Math.min(minOperations(s),minOperations(s2)+1);

    }
    static int res(String s) {
        int count=Integer.MAX_VALUE;
        if(s.charAt(0)=='0'){
            int t1=0;
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)=='1' && i%2==0) || (s.charAt(i)=='0' && i%2!=0) ){
                    t1++;
                }
            }
            count=Math.min(count,t1);
        }
        if(s.charAt(0)=='1'){
            int t2=0;
            for(int i=0;i<s.length();i++){
                if((s.charAt(i)=='0' && i%2==0) || (s.charAt(i)=='1' && i%2!=0) ){
                    t2++;
                }
            }
            count=Math.min(count,t2);
        }
        return count;
    }

    public static void main(String[] args) {
//      int res=minOperations("");
//        System.out.println(res);\
//
        int res=res("10010100");
        System.out.println(res);
    }
}
