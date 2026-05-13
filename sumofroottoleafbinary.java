import java.util.*;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class sumofroottoleafbinary {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(1);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(1);
        sum(root);

    }
    static void sum(TreeNode root){
        ArrayList<String> list = new ArrayList<>();
        temp(root,"",list);
        System.out.println(list);
    }
    static void temp(TreeNode root,String curr,ArrayList<String> list){
        if(root==null){
            return;
        }
        curr+=root.val;
        if(root.left==null && root.right==null){
            list.add(curr);
        }
        else{
           temp(root.left,curr,list);
           temp(root.right,curr,list);
        }


    }
//    static int binarytoint(int n){
//        int res=0;
//
//        return res;
//    }
}
