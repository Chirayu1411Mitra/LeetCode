import java.util.*;
public class fourdivisor {
    public static void main(String[] args) {
    int[] nums={1,2,3,4,5,7,9,6,8,10};
    sum(nums);
    }
    static void sum(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            int n = (int) Math.sqrt(nums[i]);
            System.out.println(n);
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j =1;j<=n;j++){
                if(nums[i]%j==0){
                    if(!temp.contains(j))  temp.add(j);
                    if(!temp.contains(nums[i]/j) )   temp.add(nums[i] / j);

                }
                System.out.println(temp);

            }
            if(temp.size()==4){
                list.add(temp.get(0));
                list.add(temp.get(1));
                list.add(temp.get(2));
                list.add(temp.get(3));
            }

        }
        int sum=0;
        for(int i=0;i<list.size();i++){
            sum+=list.get(i);
       }
//        return sum;
        System.out.println(list);
        System.out.println(sum);
    }
}
