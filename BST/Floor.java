package BST;

// floor : mean the greatest number in the bst which is less than or equal to  that numbers.

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}

public class Floor {

    public static Node FindFloor(Node root, int x) {
        if (root == null)
            return null;
        Node result = null;
        while (root != null) {

            if (root.data == x) {
                return root;
            }

            if (root.data > x) {
                root = root.left;
            } else {
                result = root;
                root = root.right;
            }

        }
        return result;

    }

    public static void main(String[] args) {

    }

}
