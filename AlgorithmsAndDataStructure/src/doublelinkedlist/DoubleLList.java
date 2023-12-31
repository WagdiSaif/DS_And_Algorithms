package doublelinkedlist;

import java.util.Scanner;
 

class Node
{
     int data;
    Node next, prev;
 
   
    public Node()
    {
        next = null;
        prev = null;
        data = 0;
    }

    public Node(int d, Node n, Node p)
    {
        data = d;
        next = n;
        prev = p;
    }
  
   
   

}
 

class linkedList
{
     Node start;
     Node end ;
     int size;
 

    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
   
    public boolean isEmpty()
    {
        return start == null;
    }
  
    public int getSize()
    {
        return size;
    }

    public void insertAtStart(int val)
    {
        Node nptr = new Node(val, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            start.prev=nptr;
            nptr.next=start;
            start = nptr;
        }
        size++;
    }

    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val, null, null);        
        if(start == null)
        {
            start = nptr;
            end = start;
        }
        else
        {
            nptr.prev=end;
            end.next=nptr;
            end = nptr;
        }
        size++;
    }

    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val, null, null);    
        if (pos == 1)
        {
            insertAtStart(val);
            return;
        }            
        Node ptr = start;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node tmp = ptr.next;
                ptr.next=nptr;
                nptr.prev=ptr;
                nptr.next=tmp;
                tmp.prev=nptr;
            }
            ptr = ptr.next;            
        }
        size++ ;
    }
 
    public void deleteAtPos(int pos)
    {        
        if (pos == 1) 
        {
            if (size == 1)
            {
                start = null;
                end = null;
                size = 0;
                return; 
            }
            start = start.next;
            start.prev=null;
            size--; 
            return ;
        }
        if (pos == size)
        {
            end = end.prev;
            end.next=null;
            size-- ;
        }
        Node ptr = start.next;
        for (int i = 2; i <= size; i++)
        {
            if (i == pos)
            {
                Node p = ptr.prev;
                Node n = ptr.next;
 
                p.next=n;
                n.prev=p;
                size-- ;
                return;
            }
            ptr = ptr.next;
        }        
    }    

    public void display()
    {
        System.out.print("\nDoubly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            return;
        }
        if (start.next== null) 
        {
            System.out.println(start.data );
            return;
        }
        Node ptr = start;
        System.out.print(start.data+ " <-> ");
        ptr = start.next;
        while (ptr.next != null)
        {
            System.out.print(ptr.data+ " <-> ");
            ptr = ptr.next;
        }
        System.out.print(ptr.data+ "\n");
    }
}
 

public class DoubleLList
{    
    public static void StartDoubleLinkedList()
    {            
        Scanner scan = new Scanner(System.in);
    
        linkedList list = new linkedList(); 
        System.out.println("Doubly Linked List Test\n");          
        char ch;
     
        do
        {
            System.out.println("\nDoubly Linked List Operations\n");
            System.out.println("1. insert at begining");
            System.out.println("2. insert at end");
            System.out.println("3. insert at position");
            System.out.println("4. delete at position");
            System.out.println("5. check empty");
            System.out.println("6. get size");
 
            int choice = scan.nextInt();            
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                list.insertAtStart( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("Enter integer element to insert");
                list.insertAtEnd( scan.nextInt() );                     
                break;                         
            case 3 : 
                System.out.println("Enter integer element to insert");
                int num = scan.nextInt() ;
                System.out.println("Enter position");
                int pos = scan.nextInt() ;
                if (pos < 1 || pos > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.insertAtPos(num, pos);
                break;                                          
            case 4 : 
                System.out.println("Enter position");
                int p = scan.nextInt() ;
                if (p < 1 || p > list.getSize() )
                    System.out.println("Invalid position\n");
                else
                    list.deleteAtPos(p);
                break;     
            case 5 : 
                System.out.println("Empty status = "+ list.isEmpty());
                break;            
            case 6 : 
                System.out.println("Size = "+ list.getSize() +" \n");
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;   
            }    
        
            list.display();
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);    
 
        } while (ch == 'Y'|| ch == 'y');               
    }
}