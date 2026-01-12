import java.util.Scanner;

class BSTNode {
    int data;
    BSTNode left, right;
    BSTNode(int val) { data = val; }
}

public class BSTExample {
    static BSTNode insert(BSTNode root, int val) {
        if (root == null) return new BSTNode(val);
        if (val < root.data) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }

    static void inorder(BSTNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BSTNode root = null;
        System.out.print("Enter number of elements to insert in BST: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value: ");
            root = insert(root, sc.nextInt());
        }
        System.out.print("Inorder Traversal (Sorted): ");
        inorder(root);
    }
}
