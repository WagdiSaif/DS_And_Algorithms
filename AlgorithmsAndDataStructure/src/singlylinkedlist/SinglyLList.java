package singlylinkedlist;

public class SinglyLList {
  
    static Node head;
  
    static class Node {
  
        int data;
        Node next;
  
        Node(int d) {
            data = d;
            next = null;
        }
    }
  Node tail=null;
     public void NodeAddToList(int data) {  
        Node newNode = new Node(data);  
  
         if(head == null) {  
         
            head = newNode;  
            tail = newNode;  
        }  
        else {  
           
            tail.next = newNode;  
             tail = newNode;  
        }  
    }  
 

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
  
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
  
    public static void StartSinglyLList() {
        SinglyLList list = new SinglyLList();
       list.NodeAddToList(4);  
       list.NodeAddToList(6);  
       list.NodeAddToList(7);  
       list.NodeAddToList(1);  
       list.NodeAddToList(5);  
       list.NodeAddToList(8);  
       list.NodeAddToList(3);
       list.NodeAddToList(2);  
   System.out.println("Original Linked list");
        list.printList(head);
        
         head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
        System.out.println("\n");
      
    }
}