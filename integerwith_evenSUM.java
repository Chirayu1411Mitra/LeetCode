public class integerwith_evenSUM {
    static int countEven(int num) {
        int count=0;
        for(int i =1;i<=num;i++){
            int digit=digit_sum(i);
            if(digit%2==0){
                count++;
            }
        }
        return count;
    }
    static int digit_sum(int num){
        if(num<10){
            return num;
        }
        int sum =0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int num =4;
        int count= countEven(num);
        System.out.println(count);
    }
}