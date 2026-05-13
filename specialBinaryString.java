import java.util.ArrayList;

public class specialBinaryString {
    public static void main(String[] args) {
        res("10110010");
    }
    static void res(String s){
        //String result="";
        ArrayList<String> list= new ArrayList<>();
        for(int  i =0;i<s.length();i++){
            for(int  j =i ;j<s.length()-1;j++){
                String temp=s.substring(i,j+2);
                    list.add(temp);
                }
            }
        System.out.println(list);
        }
    }
//    static boolean isValid(String s){
//        if(s.length()%2!=0) return false;
//
//    }

