import java.util.ArrayList;
//
//public class alternatingbits {
//    public static void main(String[] args) {
//       boolean temp= is(5);
//        System.out.println(temp);
//
//    }
//    static boolean is(int n){
//       ArrayList<Integer> sb= new ArrayList<>();
//        while(n>=1){
//            sb.add((n%2));
//            n=n/2;
//        }
//        for(int i=0;i<sb.size()-1;i++){
//            if(sb.get(i)==sb.get(i+1)){
//                return false;
//            }
//        }
//        return true;
//    }
//    }
public class alternatingbits {
    public static boolean isBalanced(String s) {
        // Remove all non-bracket characters first
//        s = s.replaceAll("[^\\(\\)\\[\\]\\{\\}]", "");
//
//        int lastLength;
//        do {
//            lastLength = s.length();
//            s = s.replace("()", "")
//                    .replace("[]", "")
//                    .replace("{}", "");
//        } while (s.length() < lastLength);
//
//        return s.isEmpty();



      //  "[^\\(\\)\\[\\]\\{\\}]"
      //  "[^\\(\\)\\[\\]\\{\\}]"











        s=s.replaceAll("[^\\(\\)\\[\\]\\{\\}]","");
        int last;
        do{
        last=s.length();
        s=s.replace("{}","");
           s= s.replace("()","");
            s=s.replace("[]","");
        }while(s.length()<last);

        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{[()]}")); // true
        System.out.println(isBalanced("([)]"));   // false
    }
}
