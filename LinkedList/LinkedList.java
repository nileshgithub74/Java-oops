package LinkedList;
import java.util.*;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
      static Node head = null;

    public  static void TraversalOfLinkedList(Node head){
        if(head == null) return;

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data +" ");
            curr = curr.next;
        }

    }

    public static  void BuildLinkedlist(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the  no of nodes: ");
        int n = sc.nextInt();

           System.out.println("enter the elements");
        Node head = new Node(sc.nextInt());
       
         Node curr = head;
         for(int i =1; i<=n; i++){
            curr.next = new Node(sc.nextInt());
            curr = curr.next;

         }


        sc.close();

    }


    
    public static void main(String[] args){

       BuildLinkedlist();

        TraversalOfLinkedList(head);


    }
    
}
