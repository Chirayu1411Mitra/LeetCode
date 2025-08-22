
import java.util.ArrayList;

public class divide_String {
    static String[] divide(String s , int k , char fill){
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i<s.length();i+=k){
            int end = Math.min(i+k,s.length());
            list.add(s.substring(i,end));
        }
        String last = list.get(list.size()-1);
        if(last.length()<k){
            StringBuffer sb = new StringBuffer(last);
            while(sb.length()<k){
                sb.append(fill);
            }
            list.set(list.size()-1,sb.toString());
        }


        String[] result = new String[list.size()];
        for(int i =0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "abcdefghijh";
        String[] s1 = divide(s,3, 'x');
        for(int i =0;i<s1.length;i++){
            System.out.println(s1[i]);
        }
    }
}
