import java.util.*;
class Node{
    int data;
    Node left, right;
    public Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class binaryTree{

    
    Node data;
    binaryTree() {data = null;}
    binaryTree(int x) {data = new Node(x);}


    static Node addtoBT(int[] arr, int i) {
        Node root = null;
        if(i<arr.length)
        {
            root = new Node(arr[i]);
            root.left = addtoBT(arr, 2*i+1);
            root.right = addtoBT(arr, 2*i+2);
        }
        return root;
    }

    static void inorderTraversal(Node root)
    {
        if(root == null)
        {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.data + " ");
        inorderTraversal(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for(int i=0;i<num;i++)
            arr[i] = sc.nextInt();
        binaryTree tree = new binaryTree();
        tree.data = binaryTree.addtoBT(arr, 0);
        inorderTraversal(tree.data);
        sc.close();
    }    
}