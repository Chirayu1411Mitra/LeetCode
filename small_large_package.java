    public class small_large_package {
        public static void main(String[] args) {
    min_package(10,1,13);

        }
        static void min_package(int small , int large, int items ){
            int small_needed = items%5;
            int large_needed= items/5;
            if(large_needed<large)
            if(small_needed>=2){
                small_needed=0;
                large_needed++;
            }
            System.out.println(small_needed+large_needed);

        }


    }
