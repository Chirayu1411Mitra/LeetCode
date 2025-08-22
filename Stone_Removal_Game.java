public class Stone_Removal_Game {
    public static void main(String[] args) {
        int n =50;
        boolean S = canAliceWin(n);
        System.out.println(S);
    }
    static boolean canAliceWin(int n) {
        if(n<10){
            return false;
        }
        int sub=10;
        while(sub!=0 && n>0 &&n!=10 ){
            n=n-sub;
            sub--;
        }
        if(sub%2==0){
            return true;
        }
        return false;


    }
}
