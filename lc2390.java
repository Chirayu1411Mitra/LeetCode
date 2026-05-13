public class lc2390 {
    public static void main(String[] args) {
        String s=remstas("leet**cod*e");
        System.out.println(s);
    }
    static String remstas(String s){
        int count=0;
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*'){
                count++;
                continue;
            }
            if(count!=0){
                count--;
                continue;
            }

            sb.append(s.charAt(i));
        }
        return sb.reverse().toString();
    }

}
