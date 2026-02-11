import java.util.*;
public class luckyInteger {
    public static void main(String[] args) {
        int vvowel=0;
        int vconst=0;
       String s = "aeiaeai";
            Map<Character, Integer> frequencyMap = new HashMap<>();
            for(int i =0;i<s.length();i++){
                frequencyMap.put(s.charAt(i), frequencyMap.getOrDefault(s.charAt(i), 0) + 1);
            }
            for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
                if(entry.getKey()=='a' || entry.getKey()=='e' || entry.getKey()=='i'|| entry.getKey()=='o'||entry.getKey()=='u' ){
                    if(entry.getValue()>vvowel) {
                        vvowel = entry.getValue();
                    }
                }
                else if(entry.getValue()>vconst){
                    vconst= entry.getValue();
                }
        }
        System.out.println(vvowel);
        System.out.println(vconst);
    }
}
