package BST;


 class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data; this.left = null; this.right = null;

    }
 }

public class InsertionInBST {

    public static Node Insert(Node root, int data){
        if(root == null) {
            root = new Node(data);
            return root;
        }
        if(root.data < data){
         root.left =    Insert(root.left, data);
        }else{
          root.right =   Insert(root.right, data);
        }

        return root;



    }

    public static int Minvalue(Node root){
        while(root.left != null){
            root = root.left;
        }
        return root.data;


    }

    public static int MaxValue(Node root){
        while (root.right != null) {
            root = root.right;
            
        }
        return root.data;
    }

    public static boolean  SearchBst(int data , Node root){

        if(root == null) return false;
        if(root.data == data)return true;


        if(root.data < data){
           return   SearchBst(data, root.right);
        }
        else{
          return   SearchBst(data, root.right);
        }
        

    }
    public static void main(String[] args){

    }
    
}
