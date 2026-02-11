import  java.util.*;
public class countprime {
    public static void main(String[] args) {
        int c= countPrimes(10);
        System.out.println(c);
    }
    static int countPrimes(int n) {
        int count=0;
        for(int i =1;i<n;i++){

                count++;

        }
        return count;
    }
    static boolean checkprime(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =2;i<=n;i++){
            while(n%i==0){
                list.add(i);
                n=n/i;
            }
        }
        if(list.size()==1){
            return true;
        }
        return false;
    }
}
