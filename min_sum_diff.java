import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class min_sum_diff{
public static void main(String[] args) {
    
    int[] nums={3,1,2};
    long min=min_sum(nums);
    System.out.println(min);
}
    static long min_sum(int[] nums){
        int min_sum=0;
        int eletoremove= nums.length/3;
        ArrayList<Integer> list= new ArrayList<>();
//        System.out.println(eletoremove);
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        int max =list.get(0);
        int min=list.get(0);
        int maxindex=0;
        int minindex=0;
        for (int i = 0; i <list.size(); i++) {
            int currentElement = list.get(i);

            if (currentElement > max) {
                max = currentElement;
                maxindex=i;
            }

            if (currentElement < min) {
                min = currentElement;
                minindex=i;
            }
        }
        list.remove(minindex);
      list.remove(maxindex);

        System.out.println(list);
       int sumffirst=0;
       int sumsecond=0;
       for(int i =0;i<eletoremove;i++){
           sumffirst+=list.get(i);
       }
        for(int i =eletoremove;i<list.size();i++){
            sumsecond+=list.get(i);
        }
        long minsum=(long)sumsecond-sumffirst;
        return minsum;




    }



}

