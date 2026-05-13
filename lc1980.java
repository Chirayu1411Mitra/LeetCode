import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class lc1980 {
    public static void main(String[] args) {
        String[] arr={"00","01"};
        String res=find(arr);
        System.out.println(res);
    }
    static String find(String[] s){
        int n = s[0].length();
        String curr="";
        ArrayList<String> list = new ArrayList<>();
        possstring(list,n,curr);
        HashSet<String> set=new HashSet<>(Arrays.asList(s));
        for(String c : list){
            if(!set.contains(c)){
                return c;
            }
        }
        return null;

    }
    static void possstring(ArrayList<String> list,int n,String curr){
        if(n==0){
            list.add(curr);
            return;
        }
        possstring(list,n-1,curr+"0");
        possstring(list,n-1,curr+"1");
    }
}
