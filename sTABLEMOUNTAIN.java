import java.util.ArrayList;

public class sTABLEMOUNTAIN {
    static void stable(int [] arr,int k ){
        ArrayList list = new ArrayList<>();
        for(int i =1;i<= arr.length-1;i++){
            if(arr[i-1]>k){
                list.add(arr[i]);
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        stable(arr,2);
    }
}
