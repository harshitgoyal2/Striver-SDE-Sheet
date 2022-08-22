// reccursive method
class Solution {
    List<Integer> inorder = new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
        traversal(root);
        return inorder;
    }
    
    private void traversal(TreeNode root)
    {
        if(root != null)
        {
            traversal(root.left);
            inorder.add(root.val);
            traversal(root.right);
        }
    }
}