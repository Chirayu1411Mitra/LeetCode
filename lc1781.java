import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class lc1781 {
    public static void main(String[] args) {
        int res =beautysum("vcdrfffdchvdbhwnvoifkxfchicszovrbeafebxkicbevnmatkkhusxkgytuxopgszuzbqgkoetxjlpyvntvozntxbjumaedmdomqzqiqqlqkxecwptzvzkwddvrrnfjsqbosuxexyiqecexzxwnftqhsqqtcjlokfdglobphkfferqedvuatahxtzyjmgajgmfuvokormpwjagxinwegstolpwsqravzsujnxadyafagibnlwyhutprbepnwppfkaqxrgzkicyplszvhmjwpzcvdojjkzqmdirvuqedltqgilzsfdotumpxyymabqthwipxdnvjidbnbwpcdzxwbqwunlmazstrjnshfajqs");
        System.out.println(res);
    }
    static int beautysum(String s){
        int res=0;
        ArrayList<String> sub= new ArrayList<>();
        for(int i =0;i<s.length();i++){
            for(int j=1;j<=s.length()-i;j++) {
                sub.add(s.substring(i, i + j));
            }
        }
        System.out.println(sub);
        for(String i :sub){
            res+=sum(i);
        }
        return res;
    }
    static int sum(String s){
        if(s.length()==1) return 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i =0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int min=Integer.MAX_VALUE;
        int max=0;
        for(Map.Entry<Character,Integer> entry: map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
            }
            if(entry.getValue()<min){
                min=entry.getValue();
            }
        }
        return max-min;
    }

}
