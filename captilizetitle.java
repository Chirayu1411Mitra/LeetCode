    import java.util.Arrays;
    import java.util.Locale;

    public class captilizetitle {
        public static void main(String[] args) {
    captalize("gelLo efsf");
        }
        static void  captalize(String title){
            StringBuffer sb= new StringBuffer();
            String temp= Arrays.toString(title.split(" "));
            Character.toUpperCase(temp.charAt(0));
            for(int i =1;i<temp.length();i++){
                Character.toUpperCase(temp.charAt(i));
            }
            sb.append(temp);
            System.out.println(sb);
        }
    }

