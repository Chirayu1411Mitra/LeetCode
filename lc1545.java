public class lc1545 {
    public static void main(String[] args) {
    findkbits(4,4);

    }
    static char findkbits(int n , int k){
        String s="";
        String res=R(s,n);
        return res.charAt(k);
    }
    static String R(String S ,int n){
        if(n==1){
            return "0";
        }
        return R(S,n-1)+'1'+rev(R(S,n-1));
    }
    static String rev(String s){
        StringBuilder sb= new StringBuilder();
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.reverse().toString();
    }

}
