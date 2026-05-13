import java.util.ArrayList;

public class lc1448 {
    public static void main(String[] args) {

    }
    static void good(TreeNode root) {
        if(root!=null){
           int res= recur(root,root.val);
        }
        //return res;
    }
    static int recur(TreeNode root, int currentmax){
        if (root == null) {
           return 0;
        }
        int count=0;
        if(root.val>=currentmax) count=1;
        currentmax=root.val;
        return count+recur(root.left,currentmax)+recur(root.right,currentmax);



    }
}

