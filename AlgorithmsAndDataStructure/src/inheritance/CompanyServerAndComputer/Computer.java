package inheritance.CompanyServerAndComputer;



abstract public class Computer {
protected double PriceComputer;
protected Number  Ram;
protected int   NumC ;
protected Number SpeedCPU;
  
  Computer( double pricecomputer,int numc, Number speedcpu,Number ram) {
         SpeedCPU = speedcpu;
       NumC=numc;
        Ram=ram;
       PriceComputer=pricecomputer;
      
        
    }
    
 public void setPrice(double ComputerPrice) {
     
     
        if( ComputerPrice>0){
            
       this.PriceComputer= ComputerPrice;
        }
        else {System.out.print("input PriceComputer not Acceptable");}
 
        
    }
      public void PrintInfo(){
        System.out.println("System Computer Information are\n");
        
         System.out.println("Ram | "+"          |       Price      |"+"  Numc     |"+" SpeedCPU  |");
          System.out.println(Ram+"GB"+" \t        |   \t"+PriceComputer+" \t   |\t"+NumC+"\t|"+  SpeedCPU +" GHz");
          
    
        
            
       
    }
    public double getPrice() {
        return  PriceComputer;
    }

   
   
  

    
}
