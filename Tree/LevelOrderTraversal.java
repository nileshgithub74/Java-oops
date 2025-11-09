// package Tree;

// import java.util.*;

// class Node{
//     int data;
//     Node left;
//     Node right;

//     Node(int data){
//         this.data = data;
//         this.left = null;
//         this.right = null;

//     }
// }

// public class LevelOrderTraversal{

//     public static List<Integer>  levelOrder(Node root){
//         List<Integer> result = new ArrayList<>();

//         if(root == null) return result;

//         Queue<Node> q = new LinkedList<>();
//         q.add(root);

//         while(!q.isEmpty()){
//             Node curr = q.poll();

            
//             result.add(curr.data);

//             if(curr.left != null) q.add(curr.left);
//             if(curr.right != null)q.add(curr.right);





//         }
//         return result;

//     }
//     public static void  main(String[] args){
//         Node root = new Node(1);
//          root.left = new Node(20);
//         root.right = new Node(30);
//         root.left.right = new Node(40);
//         root.left.left = new Node(50);

//         List<Integer> ans = levelOrder(root);

//         for(int x : ans){
//             System.out.print(x + " ");
//         }



//     }
// }