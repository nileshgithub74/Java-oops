
class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;

    }
}

public class PrintNodeKdistance {

    public static  void printNode(int k, Node root) {
        if (root == null)
            return;

        if (k == 0) {
            System.out.print(root.data + " ");
        } else {
            printNode(k - 1, root.left);
            printNode(k - 1, root.right);
        }
    }

    public static void main(String[] agrs) {
       Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(50);
        root.right.right = new Node(70);
        root.right.right.right = new Node(80);

        int k  = 3;

        printNode(k, root);


    }

}
