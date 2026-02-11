import com.sun.source.tree.Tree;

import java.util.*;
public class maxlevelsum {
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
        maxlevelsum solution = new maxlevelsum();

        // Construct a sample tree manually
// Tree Structure:
        //       1
        //      / \
        //     7   0
        //    / \
        //   7  -8

        // Note: We use 'solution.new' because TreeNode is a non-static inner class
        TreeNode root = solution.new TreeNode(1);
        root.left = solution.new TreeNode(7);
        root.right = solution.new TreeNode(0);
        root.left.left = solution.new TreeNode(7);
        root.left.right = solution.new TreeNode(-8);

        // Call the function
        int result = maxproduct(root);
        System.out.println("Output: " + result);
        System.out.println(max);
    }

//    public static int maxLevelSum(TreeNode root) {
//        int sum=0;
//        int level=0;
//        if(root==null) return sum;
//        Queue<TreeNode> q= new LinkedList<>();
//        q.add(root);
//
//        while(!q.isEmpty()){
//            int temp=q.size();
//            int tempsum=0;
//            int i=0;
//            while(i<=temp){
//                TreeNode node= q.poll();
//                if(node!=null) tempsum+=node.val;
//                if(node.left!=null) q.add(node.left);
//                if(node.right!=null) q.add(node.right);
//                i++;
//            }
//
//            if(sum<tempsum){
//                sum=tempsum;
//                level=i;
//            }
//        }
//        return level;
//    }
    public static int maxproduct(TreeNode root){

        int curr=maxsum(root);
        return max;

    }
    static int max=Integer.MIN_VALUE;
    static int maxsum(TreeNode root){
        if(root==null) {
            return 0;

        }

        int left=maxsum(root.left);
        int right=maxsum(root.right);
        int curr=root.val+left+right;
        max=Math.max(max,curr);
       // System.out.println("Subtree rooted at node " + root.val + " has sum: " + curr);
        return curr;
    }
}

