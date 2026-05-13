import java.util.ArrayList;
import java.util.HashSet;

public class ifstringcontainsallbsubstrings {
    public static void main(String[] args) {
hasall("00110",2);
    }
    static void hasall(String s, int k){
        HashSet<String> list=new HashSet<>();
        for(int i =0;i<=s.length()-k;i++){
                list.add(s.substring(i,i+k));
            }
        if(list.size()!=Math.pow(2,k));
        System.out.println(list);
    }
}
