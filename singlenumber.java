import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class singlenumber {
    static void singleNumber(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[2];
        Map<Integer,Integer> map= new HashMap<>();
        for(int i: nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> freq: map.entrySet()){
            if(freq.getValue()==1){
                list.add(freq.getKey());
            }
        }
        for(int i=0;i<list.size() && i<arr.length;i++){
            arr[i]= list.get(i);
        }
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    public static void main(String[] args) {
        int[] arr= {1,2,3,3,4,4};
        singleNumber(arr);
        
    }
}
