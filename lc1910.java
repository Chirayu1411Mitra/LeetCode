public class lc1910 {
    public static void main(String[] args) {
        String res=res("daabcbaabcbc","abc");
        System.out.println(res);
    }
    static String res(String s,String part){
        StringBuilder sb=new StringBuilder();
        sb.append(s);
        int start=0;
        int end=3;
        while(end<=s.length()){
            String temp=s.substring(start,end);
            if(temp.equals(part)){
                sb.delete(start,end);
                s=sb.toString();
                start=0;
                end=3;
                continue;
            }
            start++;
            end++;
        }
        return sb.toString();
    }
    }

