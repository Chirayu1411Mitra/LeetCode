import java.util.*;

public class binarysuubstring {
    public static void main(String[] args) {
        List<String> res= new ArrayList<>();
        int count=sub("00110011",res);
        System.out.println(count);
        System.out.print(res);
    }
    static int sub(String s,List<String> res){
        int count=0;
        for(int i =0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String temp=s.substring(i,j+1);
                if(isValid(temp)) {count++;
                    res.add(temp);
                }
            }
        }
        return  count;
    }
    static boolean isValid(String s){
        if(s.length()%2!=0) return false;
        if(s.length()==2) {
            if (s.charAt(0) == s.charAt(1)) return false;
        }
        int mid=s.length()/2;
        if(s.charAt(mid)==s.charAt(mid+1)) return false;
        for(int i =0;i<mid-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) return false;
        }
        for(int i=mid;i<s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)) return false;
        }

        return true;
    }
}
