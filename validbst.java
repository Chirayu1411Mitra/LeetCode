import java.lang.reflect.Array;
import java.util.ArrayList;

public class validbst {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public static void main(String[] args) {

    }
    static boolean valid(TreeNode root){
    ArrayList<Integer> list= new ArrayList<>();
    inorder(root,list);
     for(int i=0;i<list.size()-1;i++){
         if(list.get(i)>list.get(i+1)) return false;
     }
     return true;
    }
    static void inorder(TreeNode root, ArrayList<Integer>list){
        if(root==null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
}
