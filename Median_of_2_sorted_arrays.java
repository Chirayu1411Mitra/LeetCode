import java.util.ArrayList;
public class Median_of_2_sorted_arrays{
    public static void main(String[] args){
            int [] arr1={1,3};
            int [] arr2={2};
            ArrayList<Integer> list=new ArrayList<>();
            list=merge(arr1,arr2);
            System.out.println(list);
            double median=median(list);
            System.out.println(median);

        }
    static ArrayList<Integer> merge(int [] arr1,int [] arr2){
        int i=0,j=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (i<=arr1.length-1 && j<=arr2.length-1){
            if(arr1[i]<arr2[j]){
                list.add(arr1[i]);
                i++;
                }
            else if(arr1[i]>arr2[j]){
                list.add(arr2[j]);
                j++;
                }
            else{
                list.add(arr1[i]);
                list.add(arr2[j]);
                i++;
                j++;
                }
            }
     while(i<arr1.length){
        list.add(arr1[i]);
            i++;
        }
     while(j<arr2.length){
         list.add(arr2[j]);
            j++;
        }
        return list;
    }
    static double median(ArrayList<Integer> list){
    
    int size=list.size();
    if(size%2==1){
    return list.get(size/2);
    }
    else{
    int mid1=list.get(size/2);
    int mid2=list.get((size/2)-1);
        return (mid1+mid2)/2;
    }
    }

}   

