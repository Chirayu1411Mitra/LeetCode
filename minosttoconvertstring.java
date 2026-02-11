public class minosttoconvertstring {
    public static void main(String[] args) {

    }
    static int min (String s , String t, char[] org, char[]change, int[] cost){
        int mincost=0;
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)==t.charAt(i)) continue;
            if(!count(s.charAt(i),org)) {
                int idx = index(org, s.charAt(i));
                if (t.charAt(i) == change[idx]) {
                    mincost += cost[0];// change klarna baad me
                    continue;
                }
            }
            else{


            }
        }
        return mincost;
    }
    static int index(char[] org,char c){
        for(char i:org){
            if(i==c){
                return i;
            }
        }
        return -1;
    }
    static boolean count(char c,char[] org){
        int count=0;
        for(int i=0;i<org.length;i++){
            if(count>1) return true;
            if(org[i]==c){
                count++;
            }
        }
        return false;
    }
}
