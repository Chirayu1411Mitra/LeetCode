import java.util.*;
public class lc3129 {
    public static void main(String[] args) {
       int res= stablesubarray(3,3,2);
        System.out.println(res);
    }
    static int stablesubarray(int zero , int one , int limit){
    ArrayList<String > list= new ArrayList<>();
    int n=zero+one;
    subaray(n,list,"",one);
        System.out.println("List");
        System.out.println(list);
    return list.size();

    }
    static void subaray(int n, ArrayList<String> list,String curr,int limit){
        if(n==0){
            System.out.println(curr);
            int temp=0;
            for(int i =0;i<curr.length();i++){
                temp+=curr.charAt(i)-'0';
            }
            if(temp==limit){
                list.add(curr);
            }
            return;
        }
        subaray(n-1,list, curr+"1",limit);
        subaray(n-1,list,curr+"0",limit);
    }
}
