import java.util.ArrayList;
import java.util.*;

public class sortVowels {
    public static void main(String[] args) {
String s=sortvowel("LeEtcOde");
        System.out.println(s);

    }
    static String sortvowel(String s){
        ArrayList<Integer> c = new ArrayList<>();
        ArrayList<Integer> index= new ArrayList<>();
        StringBuilder st = new StringBuilder(s);
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'||s.charAt(i)=='u' || s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                int asci = (int) s.charAt(i);
                c.add(asci);
                index.add(i);
            }
        }
        System.out.println(st);
          Collections.sort(c);
        System.out.println(c);
       for(int i=0 ;i<c.size();i++){
            st.setCharAt(index.get(i),(char)(int)c.get(i));
        }
       return st.toString();
    }


}
