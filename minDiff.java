import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class minDiff {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        List<List<Integer>> list = minimumAbsDifference(arr);
        System.out.println(list);

    }
    static List<List<Integer>> minimumAbsDifference(int[] arr) {
        ArrayList<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int start=0;
        int end=start+1;
        int min = arr[end]-arr[start];
        while(end<arr.length){

            if(arr[end]-arr[start]<min){
                min=arr[end]-arr[start];
            }
            start++;
            end++;
        }
        int start2=0;
        int end2=start2+1;

        while(end2<arr.length){

            if(arr[end2]-arr[start2]==min){
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(arr[start2]);
                temp.add(arr[end2]);
                list.add(temp);
            }
            start2++;
            end2++;
        }
        return list;


    }
}
