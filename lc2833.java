public class lc2833 {
    static int furthestDistanceFromOrigin(String moves) {
        char prev='L';
        int res=0;
        int temp=0;
        for(int i =0;i<moves.length();i++){
            if(moves.charAt(i)=='_'){
                if(prev=='L')temp--;
                else temp++;

                if(Math.abs(temp)>res){
                    res=Math.abs(temp);
                }
            }
            else if(moves.charAt(i)=='L'){
                temp--;
                if(Math.abs(temp)>res){
                    res=Math.abs(temp);
                }
                prev='L';
            }
            else{
                temp++;
                if(Math.abs(temp)>res){
                    res=Math.abs(temp);
                }
                prev='R';
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int res=furthestDistanceFromOrigin("L_RL__R");
        System.out.println(res);
    }
}
