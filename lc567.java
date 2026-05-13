import java.util.*;
public class lc567 {
    public static void main(String[] args) {
        boolean res=checkInclusion("ab","eidooo");
        System.out.println(res);
    }
    static boolean checkInclusion(String s1, String s2) {
        int[] freq=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }
        int start=0;
        int end=s1.length()-1;
        while(end<s2.length()){
            int[] wind = new int[26];
            for(int i=start;i<=end;i++){
                wind[s2.charAt(i)-'a']++;
            }
            for(int i=0;i<26;i++){
                if(Arrays.equals(wind,freq)) return true;
            }
            start++;
            end++;
        }
        return false;
    }
}
