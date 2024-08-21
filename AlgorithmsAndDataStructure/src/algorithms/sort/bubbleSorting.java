
package sort;


public class bubbleSorting {
  public static void bubbleSort(double[] array){
      
      int len=array.length;
      double tmp=0.0;
      for(int i=0;i<len;i++){
         
          for(int j=0;j<(len-i)-1;j++){
            
              if(array[j+1]<array[j]){
                  tmp=array[j];
                  array[j]=array[j+1];
                  array[j+1]=tmp;
                  
              }
          }
            
      }
      
  }
public static void printSort(double []arr,String massaage){
    
    System.err.println(massaage);
          for(int i=0;i<arr.length;i++){
              
          System.err.print(arr[i]+"   ");
        
          }
}
    
  public  static  void main(String[] args){
      
        double []arry={-9.2,11.3 ,2.5, 3.1, 4.0, 10.10,5.2 ,0.0,89.2};
         printSort(arry,"before sort");
         
          System.out.println();
        bubbleSort(arry);
        printSort(arry,"\nafter sort ");
  }}
