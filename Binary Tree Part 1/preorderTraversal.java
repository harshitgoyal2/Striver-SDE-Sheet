// recursive method
class Solution {
    /**  root left right
    space complexity: O(h) & time complexity: O(n) */
    public List<Integer> preorderTraversal(TreeNode root) {
        traversal(root);
        return preOrder;
    }
    private void traversal(TreeNode root)
    {
        if(root != null)
        {
            preOrder.add(root.val);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
}

// iterative method
class Solution {
    // root left right
    // space complexity: O(h) & time complexity: O(n) 
    List<Integer> preOrder = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root == null)
            return preOrder;
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode dup = stack.pop();
            preOrder.add(dup.val);
            if(dup.right!=null)  stack.push(dup.right);
            if(dup.left!=null)  stack.push(dup.left);
        }
        return preOrder;
    }
}