//import java.util.regex.*;
//public class valid_word {
//    public static void main(String[] args) {
//        String s = "234Adas";
//        boolean match= s.matches("A-Z");
//        if(match){
//            System.out.println("true");
//        }
//        else{
//            System.out.println("false");
//        }
//    }
//}
import java.util.regex.*;
public class valid_word {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(?=.*\\d)(?=.*[a-zA-Z])(?=.*[aeiouAEIOU])(?=.*[^aeiouAEIOU\\d\\W_]).+");
        Matcher matcher = pattern.matcher("2Adas$34");

        System.out.println(matcher.matches());
    }
}
