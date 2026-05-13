import java.util.ArrayList;

public class lc151 {
    public static void main(String[] args) {
    rev("the sky is blue");
        rev("            hello      world           ");
    }
    static void rev(String s){
        ArrayList<String> sb = new ArrayList<>();
        String temp ="";
        String res="";
        s=s.trim();
        for(int i =0;i<s.length();i++) {
            if (s.charAt(i) == ' ' && temp.equals("")) continue;
            if(s.charAt(i)==' ') {
                sb.add(temp+" ");
                temp = "";
                continue;
            }
            temp += s.charAt(i);
        }
        sb.add(temp+" ");
        System.out.println(sb);
        for(int i=sb.size()-1;i>=0;i--) {
            res+=sb.get(i);
        }
        System.out.println(res.trim());

        }
    }

