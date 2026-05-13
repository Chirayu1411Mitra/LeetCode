public class llc1009 {
    public static void main(String[] args) {
        int res =complement(7);
        System.out.println(res);

    }
    static  int complement(int n){
        int mask = (Integer.highestOneBit(n)<<1)-1;            // Creating MAsk for XOR
      int res = n ^ mask;      // XOR
      return res;
    }
}
