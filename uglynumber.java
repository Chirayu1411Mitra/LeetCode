import java.util.ArrayList;

public class uglynumber {
    public static void main(String[] args) {
        int c= ugly(10);
        System.out.println(c);
    }
    static ArrayList<Integer> result=new ArrayList<>();
    static int count=0;
    static int ugly(int n){
        int i=1;
       while (count<n){
           isugly(i);
           i++;

       }
       return result.getLast();
    }
    static boolean isugly(int n){
        ArrayList<Integer> list= new ArrayList<>();
        int temp =n;
        for(int i=2;i<=n;i++){
            while(n%i==0){
                list.add(i);
                n=n/i;
            }
        }
        for(int i:list){
            if(i!=2 && i!=3 && i!=5){
                return false;
            }
        }
        count++;
        result.add(temp);
        return true;
    }

}
