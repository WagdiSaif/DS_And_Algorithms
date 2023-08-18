package inheritance.CompanyServerAndComputer;




public class Server extends Computer implements IComputer {
    
     private int  ipAddress;
   
    public Server(double pricecomputer,int NumC, Number speedCPU,int  IpAddress,Number Ram) {
        
       
         super(pricecomputer,NumC, speedCPU,Ram);
            this.ipAddress=IpAddress;
        
    
    }
    
    @Override
    public double Cost() {
        
        double ComputerPriceWithtax=super.getPrice()+0.05;
        
      return ComputerPriceWithtax;
      
    }
       @Override
     public void setIPAdress(int IpAddress) {
        
        
           this.ipAddress=IpAddress;
   
    }

    @Override
    public int getIPAdress() {
        return  ipAddress;
   
    }

    @Override
   public void PrintInfo(){
       
       
       super.PrintInfo();
         System.out.println("Cost    | "+Cost()+"    IPAddress" +" :   " + ipAddress);
       
       
         
   }
}
