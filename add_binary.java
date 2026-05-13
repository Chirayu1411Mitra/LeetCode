public class add_binary {
    public static void main(String[] args) {
    String a="1010";
    String b="101";
//    String res=add(a,b);
//        System.out.println(res);
        reverseBits(2147483644);

    }
//    static String add(String a, String b){
//        StringBuilder sb=new StringBuilder();
//        int m=a.length()-1;
//        int n =b.length()-1;
//        int carry=0;
//
//        while(m>=0||n>=0||carry>0) {
//            int sum=carry;
//            if (m >= 0) sum += a.charAt(m--) - '0';
//            if(n>=0) sum+=b.charAt(n--)-'0';
//            sb.append(sum%2);
//            carry=sum/2;
//        }
//        return sb.reverse().toString();
//    }
    static void reverseBits(long n) {
        StringBuilder sb=new StringBuilder();
        for(int i =0;i<32;i++){
            long temp=n%2;
            sb.append(String.valueOf(temp));
            n=n/2;
        }
        long s=Long.parseLong(sb.toString(),2);
        System.out.println(s);

    }
}
//00111001011110000010100101000000


// 00111111111111111111111111111110
// 0011111111111111111111111111111