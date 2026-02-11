import java.util.ArrayList;

public class plusone {
    public static void main(String[] args) {
    int[] dig={1,2,4};
    int[] result= plus(dig);
    for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }

    }
    static int[] plus(int[] digits){
            String s="";
            for(int i=0;i<digits.length;i++){
                s+=digits[i];
            }
            int n =Integer.parseInt(s);
            n+=1;
            ArrayList<Integer> dig=new ArrayList<>();
            while(n>0){
                int temp = n%10;
                dig.add(temp);
                n=n/10;

            }
            dig.reversed();
        System.out.println(dig);
            int[] result = new int[dig.size()];
            for (int i = 0; i<dig.size(); i++) {
                result[i] = dig.get(i);
            }
            return result;
    }

}
