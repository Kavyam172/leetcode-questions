/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    TreeNode tree;
    private void restore(TreeNode node, int val,TreeNode tree){
        if(node==null){
            return;
        }

        tree.val = val;
        if(node.left!=null){
            tree.left = new TreeNode();
        }
        if(node.right!=null){
            tree.right = new TreeNode();
        }
        tree.right = new TreeNode();
        restore(node.left,(val*2)+1,tree.left);
        restore(node.right,(val*2)+2,tree.right);
    }
    private boolean findVal(TreeNode node,int target){
        if(node==null){
            return false;
        }
        if(node.val==target){
            return true;
        }
        boolean left = findVal(node.left,target);
        boolean right = findVal(node.right,target);
        return left || right;
    }
    public FindElements(TreeNode root) {
        tree = new TreeNode();
        restore(root,0,tree);
    }
    
    public boolean find(int target) {
        return findVal(tree,target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */