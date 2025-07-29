import java.util.Arrays;

public class max_matching {
    static int matchPlayersAndTrainers(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count =0;
        int i =0;
        int j =0;
        while(i<g.length){
            while (j<s.length) {
                if (g[i] == s[j]) {
                    count++;
                    i++;
                }
                j++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] player={1,2,3};
        int [] trainer={3};
        int count =matchPlayersAndTrainers(player,trainer);
        System.out.println(count);
    }

}
