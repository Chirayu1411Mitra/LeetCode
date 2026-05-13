public class lc796 {
    public static void main(String[] args) {
        System.out.println(rString("abcd","cdab"));
    }
    static boolean rString(String s, String goal){
        if(s.length()!=goal.length()) return false;
        return (s+s).contains(goal);
    }
}
