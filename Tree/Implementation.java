
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Implementation {

    public static TreeNode buildTree(Scanner sc) {
        System.out.print("Enter the value of Node (-1 for no node): ");
        int data = sc.nextInt();

        if (data == -1) return null;

        TreeNode root = new TreeNode(data);

        System.out.println("Enter the left child of " + data);
        root.left = buildTree(sc);

        System.out.println("Enter the right child of " + data);
        root.right = buildTree(sc);

        return root;
    }

    public static void preorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeNode root = buildTree(sc);

        System.out.print("\nPreorder Traversal: ");
        preorder(root);

        sc.close();
    }
}
