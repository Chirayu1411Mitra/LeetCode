public class setbits {
    static int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <=right; i++) {
            int temp = 0;
            int j = i;
            while (j >= 1) {
                if (j % 2 == 1)
                    temp++;
                j = j / 2;
            }
            if (isprime(temp)) {
                count++;
            }
        }
        return count;
    }

    static boolean isprime(int n) {
        if(n<2) return false;
        for (int i = 2; i <=Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int res= countPrimeSetBits(10,15);
        System.out.println(res);
    }
}
