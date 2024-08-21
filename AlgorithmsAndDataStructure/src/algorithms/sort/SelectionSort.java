
package sort;


public class SelectionSort {
    public static void printSort(double []arr,String massaage){
    
    System.err.println(massaage);
          for(int i=0;i<arr.length;i++){
              
          System.err.print(arr[i]+"   ");
        
          }}
       public static void selectionSort(double[] array){
      
      int len=array.length;
     
    
      for(int i=0;i<len-1;i++){
            int minIndex=i;
          for(int j=i+1;j<(len);j++)
              if( array[j]<array[minIndex])
                  minIndex=j;
                 if(minIndex!=i){
                  double tmp=array[minIndex] ;
             
          array[minIndex]= array[i];
                  array[i]=tmp;}
            
      }
      
  }
          public static  void  main(String args[]){
              
               double []arry={-9.2,11.3 ,2.5, 3.1, 4.0, 10.10,5.2 ,0.0,89.2};
         printSort(arry,"before selection Sort ");
         
          System.out.println();
        selectionSort(arry);
        printSort(arry,"\nafter selection sort ");
          }
    
    }
