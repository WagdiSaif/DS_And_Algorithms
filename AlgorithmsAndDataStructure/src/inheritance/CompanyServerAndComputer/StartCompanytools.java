package inheritance.CompanyServerAndComputer;





public class StartCompanytools{ 
 public static void StartCompany() {
     
        
Computer ObjectComputer=new Server(4000,7,4.6,255,6);;

          
   Server Cmp[]=new Server[2];
    Server Ser1=new  Server(2000,5,3.6,252,9);
   Server Ser2=new  Server(2300,4,2.6,235,4);
     Cmp[0]=Ser1;
      Cmp[1]=Ser2;
      int i=0;
     while(i<Cmp.length){
      Cmp[i].PrintInfo();
      i++;
   }
  
   
      

 }}



