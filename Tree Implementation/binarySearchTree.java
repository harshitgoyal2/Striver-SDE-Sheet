import java.util.*;

class Node{
    int data;
    Node left, right;
    Node(int data)
    {
        this.data = data;
        this.left = this.right = null;
    }
}

class binarySearchTree {
    Node root;
    binarySearchTree() {root = null;}
    binarySearchTree(int data) {root = new Node(data);}
    void add(int data) {root = addtoBST(root, data);}

    Node addtoBST(Node root, int k)
    {
        if(root == null)
            root = new Node(k);
        else if(k<root.data)
            root.left = addtoBST(root.left, k);
        else
            root.right = addtoBST(root.right, k);
        return root;
    }

    public static void printBST(Node root) {
        if(root != null)
        {
            printBST(root.left);
            System.out.print(root.data + " ");
            printBST(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        binarySearchTree tree = new binarySearchTree();
        while(true)
        {
            System.out.print("Enter a number that you want to add in a tree otherwise print -1 to terminate: ");
            int num = sc.nextInt();
            if(num == -1)
                break;
            tree.add(num);
        }
        printBST(tree.root);
        sc.close();
    }
}
