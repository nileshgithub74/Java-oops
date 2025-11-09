
public class CountNode {

    public static int CountTotal(Node root){
        if(root == null)return 0;


        return 1 + CountTotal(root.left) + CountTotal(root.right);
    }

    
    public static void main(String[] args){
         
    }
    
}
