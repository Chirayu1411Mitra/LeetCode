import java.util.ArrayList;

public class MergeString {
    public static void main(String[] args) {
        String s1="ab";
        String s2="pqrs";
        String s3= merge(s1,s2);
        System.out.println(s3);

    }
    static String merge(String word1, String word2){
        StringBuffer list = new StringBuffer();
        int n = Math.min(word1.length(),word2.length());
        for(int i=0;i<n;i++){
            list.append(word1.charAt(i));
            list.append(word2.charAt(i));
        }
        if(word1.length()>n){
            for(int i =n;i<word1.length();i++){
                list.append(word1.charAt(i));
            }
        }
        else if(word2.length()>n){
            for(int i =n;i<word2.length();i++){
                list.append(word2.charAt(i));
            }
        }
        return list.toString();
    }
}
