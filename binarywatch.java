import java.util.*;
public class binarywatch {
    public static void main(String[] args) {
bin(1);
    }
    static void bin(int turned){
        ArrayList<String> list = new ArrayList<>();
        for(int i =0;i<12;i++){
            for(int j =0;j<59;j++){
                int temp = Integer.bitCount(i)+Integer.bitCount(j);
                if(temp==turned){
                    list.add(i+":"+String.format("%02d",j));
                }
            }
        }
        System.out.println(list);
    }

}
