public class powerof2 {
    public static void main(String[] args) {
        int n = 1;
        if(power(1)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    static boolean power(int n ){
        double power=0;
        if(power>n){
            return false;
        }
        int exp=0;
        while(power<n){
            
            power=Math.pow(2,exp);
            if(power==n){
                return true;
            }
            exp++;

        }
        return false;
    }
}
