public class lc2840 {
    public static void main(String[] args) {
        boolean res= canequal("abe","bea" );
        System.out.println(res);
    }
    static boolean canequal(String s1, String s2){
        int []eve= new int[26];
        int[] odd= new int[26];

        for(int i =0;i<s1.length();i++){
            if(i%2==0){
                eve[s1.charAt(i)-'a']++;
            }
            else {
                odd[s1.charAt(i) - 'a']++;
            }
            }
        for(int i =0;i<s2.length();i++){
            if(i%2==0){
                eve[s2.charAt(i)-'a']--;

            }
            else{
            odd[s2.charAt(i)-'a']--;}
        }
        int sum1=0;
        int sum2=0;
        for(int i =0;i<s1.length();i++){
            sum1+=eve[i];
            sum2=odd[i];
        }
        return sum1 == sum2 && sum1 == 0;
    }
}
