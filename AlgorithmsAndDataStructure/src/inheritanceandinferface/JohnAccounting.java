package inheritanceandinferface;


public class JohnAccounting extends   Employee{
    
  
    @Override   
    public double getSalary() {
      
  return (super.getSalary()*.20)+(super.getSalary()); }//make 20% more money than a normal accountant
   
      @Override
    public int getVacationDays() {
         
         
        return super.getVacationDays()+3;           // get 3 days more vacation
    }
     
         public String getVacationForm() {
        return "clearclearclear";     // return claer
    }
     
}