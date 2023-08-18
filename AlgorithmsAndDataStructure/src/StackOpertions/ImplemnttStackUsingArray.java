package StackOpertions;



import java.util.Scanner;

class StackUsingArray{ 
    
    
    private double ArrayOfstack[]; 
    private int top; 
    
    private int size; 
    public StackUsingArray(int Size){ 
        this.top=-1; 
        this.size=Size; 
        ArrayOfstack=new double[size]; 
        
    }
    public void Push(double item){
        if(!Isfull()){
        ArrayOfstack[++top]=item;
  
        }
        else System.out.println("Sorry the Stack is Full Can'n Add-----------------------------------");
        
    }
  private  boolean Isfull(){
        if(top==size-1)
            return true;
        else return false;
        
    }

    private boolean IsEmpty() {
     if(top==-1)
         return true;
     else
       return false;
    
}
  public void Pop(){
      
      if(IsEmpty()){
         System.out.println("Stack is Empty No Element to pop"); 
      }
      else{
       
         System.out.println("Element Pop is  :"+ArrayOfstack[top--]); 
     
      }
  }
        
public double Peek(){
if(IsEmpty()){
      System.out.println("Stack is Empty No Element found");
return -1;
}

else return ArrayOfstack[top];}


public void DisplayAllStackElement(){
    
    if(IsEmpty()){
         System.out.println("Stack is Empty No Found Element to Display"); 
    }
    else{
      for(int i=top;i>=0;i--)
         System.out.println(ArrayOfstack[i]);}
}}
  
  

public class ImplemnttStackUsingArray {

    
    public static void StartStackUsingArray() {
        Scanner input=new Scanner(System.in);
       
        
        System.out.print("Enter The Size of Stack :"); 
        int size=input.nextInt();
        StackUsingArray stack=new StackUsingArray(size);
      
        int x=0;
        
        while(x!=5){
            
                System.out.println("Enter number 1  to push Element into stack "); 
                System.out.println("Enter number 2  to pop Element from stack ");
                System.out.println("Enter number 3  to  get Peek Element of stack "); 
                System.out.println("Enter number 4  to Dispay Elment of stack "); 
                System.out.println("Enter bumber 5 to exit "); 
                   x =input.nextInt();
                switch(x){
                    
                    case 1:{
                    System.out.println("Enter The Element That you want push it into stack ....");
                        double Element=input.nextDouble();
                        stack.Push(Element);
                     break;}
                     case 2:{
                  
                        stack.Pop();
                    break; }
                      case 3:{
                  
                        double PeekElement=stack.Peek();
                        
                         System.out.println("Element  on the Peek is  "+PeekElement);
                     
                     break;}
                        case 4:{
                    System.out.println(" The Element Of   stack  are....");
                    stack.DisplayAllStackElement();
                  
                       
                     break;}
                    
                    
                }
            
        }
        
        
        
        
        
        
      
    }
    
}
