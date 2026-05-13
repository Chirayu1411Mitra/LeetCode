import java.util.*;
public class lc2452 {
    public static void main(String[] args) {
        String[] queries = {"word", "note", "ants", "wood"};
        String[] dictionary = {"wood", "wood", "coat"};

        List<String> list = edits(queries, dictionary);
        System.out.println(list);
    }

    static List<String> edits(String[] queries, String[] dictionary) {
        ArrayList<String> list = new ArrayList<>();
        int n = queries.length;
        int m = dictionary.length;
        int l = queries[0].length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int count=0;
                for (int k = 0; k < l; k++) {
                    if (queries[i].charAt(k) == dictionary[j].charAt(k)) continue;
                    else count++;
                    if (count > 2) break;
                }
                if (count <= 2) {
                    list.add(queries[i]);
                    break;
                }
            }


        }
        return list;
    }
}