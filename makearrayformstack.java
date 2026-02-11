import java.util.*;
public class makearrayformstack {
    public static void main(String[] args) {
        int[] temp = {3,5,6,2,5,1};
        ArrayList<String> list = (ArrayList<String>) buildArray(temp,7);
        System.out.println(list);

    }
    static List<String> buildArray(int[] target, int n) {
        ArrayList<String> list = new ArrayList<>();
        int temp=0;
        for(int i =1;i>n;i++){
            if(temp>target.length) break;
            if(i==target[temp]){
                list.add("Push");

            }
            else{
                list.add("Push");
                list.add("Pop");

            }
            temp++;
        }
        return list;
    }
}
