public class reverseastring {
    public static void main(String[] args) {
        char [] num={'h','e','l','l','o'};
        rev(num);
        for (int i = 0; i <num.length; i++) {
            System.out.println(num[i]);
        }

    }
    static void rev(char [] num){
        int start =0;
        int end = num.length-1;
        while(start<end){
            char temp=num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
}
